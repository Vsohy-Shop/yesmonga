package com.google.android.play.core.tasks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.d */
public abstract class C32227d<ResultT> {
    @NonNull
    /* renamed from: a */
    public abstract C32227d<ResultT> mo93013a(@NonNull C32224a<ResultT> aVar);

    @NonNull
    /* renamed from: b */
    public abstract C32227d<ResultT> mo93014b(@NonNull Executor executor, @NonNull C32224a<ResultT> aVar);

    @NonNull
    /* renamed from: c */
    public abstract C32227d<ResultT> mo93015c(@NonNull C32225b bVar);

    @NonNull
    /* renamed from: d */
    public abstract C32227d<ResultT> mo93016d(@NonNull Executor executor, @NonNull C32225b bVar);

    @NonNull
    /* renamed from: e */
    public abstract C32227d<ResultT> mo93017e(C32226c<? super ResultT> cVar);

    @NonNull
    /* renamed from: f */
    public abstract C32227d<ResultT> mo93018f(@NonNull Executor executor, @NonNull C32226c<? super ResultT> cVar);

    @Nullable
    /* renamed from: g */
    public abstract Exception mo93019g();

    @NonNull
    /* renamed from: h */
    public abstract ResultT mo93020h();

    /* renamed from: i */
    public abstract <X extends Throwable> ResultT mo93021i(Class<X> cls) throws Throwable;

    /* renamed from: j */
    public abstract boolean mo93022j();

    /* renamed from: k */
    public abstract boolean mo93023k();
}
