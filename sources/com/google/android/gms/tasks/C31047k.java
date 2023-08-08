package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.k */
public abstract class C31047k<TResult> {
    @C0359n0
    /* renamed from: a */
    public C31047k<TResult> mo87717a(@C0359n0 Activity activity, @C0359n0 C31033d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @C0359n0
    /* renamed from: b */
    public C31047k<TResult> mo87718b(@C0359n0 C31033d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @C0359n0
    /* renamed from: c */
    public C31047k<TResult> mo87719c(@C0359n0 Executor executor, @C0359n0 C31033d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @C0359n0
    /* renamed from: d */
    public C31047k<TResult> mo87720d(@C0359n0 Activity activity, @C0359n0 C31035e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @C0359n0
    /* renamed from: e */
    public C31047k<TResult> mo87721e(@C0359n0 C31035e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @C0359n0
    /* renamed from: f */
    public C31047k<TResult> mo87722f(@C0359n0 Executor executor, @C0359n0 C31035e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @C0359n0
    /* renamed from: g */
    public abstract C31047k<TResult> mo87723g(@C0359n0 Activity activity, @C0359n0 C31037f fVar);

    @C0359n0
    /* renamed from: h */
    public abstract C31047k<TResult> mo87724h(@C0359n0 C31037f fVar);

    @C0359n0
    /* renamed from: i */
    public abstract C31047k<TResult> mo87725i(@C0359n0 Executor executor, @C0359n0 C31037f fVar);

    @C0359n0
    /* renamed from: j */
    public abstract C31047k<TResult> mo87726j(@C0359n0 Activity activity, @C0359n0 C31039g<? super TResult> gVar);

    @C0359n0
    /* renamed from: k */
    public abstract C31047k<TResult> mo87727k(@C0359n0 C31039g<? super TResult> gVar);

    @C0359n0
    /* renamed from: l */
    public abstract C31047k<TResult> mo87728l(@C0359n0 Executor executor, @C0359n0 C31039g<? super TResult> gVar);

    @C0359n0
    /* renamed from: m */
    public <TContinuationResult> C31047k<TContinuationResult> mo87729m(@C0359n0 C31031c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @C0359n0
    /* renamed from: n */
    public <TContinuationResult> C31047k<TContinuationResult> mo87730n(@C0359n0 Executor executor, @C0359n0 C31031c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @C0359n0
    /* renamed from: o */
    public <TContinuationResult> C31047k<TContinuationResult> mo87731o(@C0359n0 C31031c<TResult, C31047k<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @C0359n0
    /* renamed from: p */
    public <TContinuationResult> C31047k<TContinuationResult> mo87732p(@C0359n0 Executor executor, @C0359n0 C31031c<TResult, C31047k<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @C0363p0
    /* renamed from: q */
    public abstract Exception mo87733q();

    /* renamed from: r */
    public abstract TResult mo87734r();

    /* renamed from: s */
    public abstract <X extends Throwable> TResult mo87735s(@C0359n0 Class<X> cls) throws Throwable;

    /* renamed from: t */
    public abstract boolean mo87736t();

    /* renamed from: u */
    public abstract boolean mo87737u();

    /* renamed from: v */
    public abstract boolean mo87738v();

    @C0359n0
    /* renamed from: w */
    public <TContinuationResult> C31047k<TContinuationResult> mo87739w(@C0359n0 C31045j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @C0359n0
    /* renamed from: x */
    public <TContinuationResult> C31047k<TContinuationResult> mo87740x(@C0359n0 Executor executor, @C0359n0 C31045j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
