package com.example.tainge.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tainge.retrofit.entity.Category;
import com.example.tainge.retrofit.entity.CategoryCreate;
import com.example.tainge.retrofit.entity.CategoryResponse;
import com.example.tainge.retrofit.repository.api.CategoryService;
import com.example.tainge.retrofit.repository.network.RxAndroidServiceGenerator;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    CategoryService service;
    ArrayAdapter<Category> listItem;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv_item);

        createObject();
        getCategories();
    }

    private void createObject() {
        service = RxAndroidServiceGenerator.createService(CategoryService.class);
    }

    private void getCategories(){
        Observable<CategoryResponse> categoryObservable = service.getCategories();

        categoryObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<CategoryResponse>() {
                    @Override
                    public void onNext(CategoryResponse categoryResponseResponse) {
                        List<Category> categoryList = categoryResponseResponse.getData();
                        listItem = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,categoryList);
                        listView.setAdapter(listItem);
                        Log.e("status ==> ",categoryResponseResponse.getMsg());
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        Log.e("onCompete","completed");
                    }
                });
        categoryObservable.unsubscribeOn(Schedulers.io());

    }
    public void addCategory(View view) {
        Log.e("add ==>","add");
        CategoryCreate category = new CategoryCreate();
        category.setCateName("testing999@com");
        category.setDes("test");
        List<String> keyword=new ArrayList<>();
        keyword.add("qq");
        keyword.add("bb");
        category.setStatus(true);
        category.setKeywords(keyword);

        Observable<ResponseBody> addCategoryObservable = service.addCategory(category);

        addCategoryObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<ResponseBody>() {
                    @Override
                    public void onNext(ResponseBody response) {
                        Log.e("add ==>","success");
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        Log.e("complete","completed");
                    }
                });
        addCategoryObservable.unsubscribeOn(Schedulers.io());
    }
}
