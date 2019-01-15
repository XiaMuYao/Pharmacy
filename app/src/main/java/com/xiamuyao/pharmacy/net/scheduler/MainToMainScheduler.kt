package com.xiamuyao.pharmacy.net.scheduler

import io.reactivex.android.schedulers.AndroidSchedulers


class MainToMainScheduler<T> : BaseScheduler<T>(AndroidSchedulers.mainThread(), AndroidSchedulers.mainThread())
