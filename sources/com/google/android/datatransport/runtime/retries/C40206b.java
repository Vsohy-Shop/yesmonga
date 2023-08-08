package com.google.android.datatransport.runtime.retries;

/* renamed from: com.google.android.datatransport.runtime.retries.b */
public final class C40206b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m163528a(int i, TInput tinput, C40205a<TInput, TResult, TException> aVar, C40207c<TInput, TResult> cVar) throws Throwable {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo132561a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo132561a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
