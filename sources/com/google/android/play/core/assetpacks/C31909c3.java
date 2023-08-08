package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32052g1;
import com.google.android.play.core.internal.C32063k0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.play.core.assetpacks.c3 */
public final class C31909c3 implements C32052g1<Executor> {

    /* renamed from: a */
    public final /* synthetic */ int f77822a = 0;

    public C31909c3() {
    }

    /* renamed from: b */
    public static Executor m129463b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C31992u2.f78139b);
        C32063k0.m129858k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: c */
    public static Executor m129464c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C31992u2.f78140c);
        C32063k0.m129858k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: d */
    public static C31962n0 m129465d() {
        return new C31962n0();
    }

    /* renamed from: e */
    public static C31998w0 m129466e() {
        return new C31998w0();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo92416a() {
        int i = this.f77822a;
        return i != 0 ? i != 1 ? i != 2 ? m129466e() : m129465d() : m129464c() : m129463b();
    }

    public C31909c3(byte[] bArr) {
    }

    public C31909c3(char[] cArr) {
    }

    public C31909c3(short[] sArr) {
    }
}
