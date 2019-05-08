package com.example.tainge.retrofit.repository.api;

import com.example.tainge.retrofit.entity.CategoryCreate;
import com.example.tainge.retrofit.entity.CategoryResponse;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Tainge on 12/20/2017.
 */

public interface CategoryService {

    @GET("api/v1/categories")
    Observable<CategoryResponse> getCategories();

    @POST("api/v1/categories/create-main")
    Observable<ResponseBody> addCategory(@Body CategoryCreate categoryCreate);
}
