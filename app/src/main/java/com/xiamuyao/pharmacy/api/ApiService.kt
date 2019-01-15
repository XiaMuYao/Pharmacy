package com.xiamuyao.pharmacy.api

import com.xiamuyao.pharmacy.bean.down.*
import com.xiamuyao.pharmacy.bean.up.*
import io.reactivex.Observable
import retrofit2.http.*


interface ApiService {


    //登录
    @POST("drugtrackerservice/postprocess/")
    fun login(@Body AccountManagerup: AccountManagerup): Observable<AccountManagerdown>

    //发送验证码
    @POST("drugtrackerservice/postprocess/")
    fun fasongshoujihao(@Body AccountManagerup: SenVerifyCode): Observable<shoujihaojieshou>

    //发送验证码
    @POST("drugtrackerservice/postprocess/")
    fun shoujihaodenglu(@Body AccountManagerup: shoujihao): Observable<shoujihao>


    //获取药店信息
    @POST("drugtrackerservice/postprocess/")
    fun shoujihaodenglu(@Body AccountManagerup: yaodianxinxi): Observable<yaodianxinxidown>


    //药品查询
    @POST("drugtrackerservice/postprocess/")
    fun yaopinchaxun(@Body AccountManagerup: yaopinchaxunUP): Observable<yaopinchaxundown>

    //药品查询
    @POST("drugtrackerservice/postprocess/")
    fun kucunchaxun(@Body AccountManagerup: kucunchaxunUp): Observable<kucunchaxunDown>


    //入库查询
    @POST("drugtrackerservice/postprocess/")
    fun dddddddd(@Body AccountManagerup: churukuchaxunUp): Observable<inKuchaxunBean>

    //出库查询
    @POST("drugtrackerservice/postprocess/")
    fun chuku(@Body AccountManagerup: churukuchaxunUp): Observable<OutchaXuBean>

    //获取药品列表
    @POST("drugtrackerservice/postprocess/")
    fun dddddddd(@Body AccountManagerup: huoquyaopinListUp): Observable<yaolinListDown>



    //出入库
    @POST("drugtrackerservice/postprocess/")
    fun dddddddd(@Body AccountManagerup: churuUp): Observable<churukuDown>
}