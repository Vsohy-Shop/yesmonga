package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.C32655a;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.settings.C32940i;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.internal.common.q */
public class C32718q implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C32719a f79431a;

    /* renamed from: b */
    public final C32940i f79432b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f79433c;

    /* renamed from: d */
    public final C32655a f79434d;

    /* renamed from: e */
    public final AtomicBoolean f79435e = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.q$a */
    public interface C32719a {
        /* renamed from: a */
        void mo94921a(C32940i iVar, Thread thread, Throwable th);
    }

    public C32718q(C32719a aVar, C32940i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C32655a aVar2) {
        this.f79431a = aVar;
        this.f79432b = iVar;
        this.f79433c = uncaughtExceptionHandler;
        this.f79434d = aVar2;
    }

    /* renamed from: a */
    public boolean mo95014a() {
        return this.f79435e.get();
    }

    /* renamed from: b */
    public final boolean mo95015b(Thread thread, Throwable th) {
        if (thread == null) {
            C32741f.m132248f().mo95054d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            C32741f.m132248f().mo95054d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f79434d.mo94841b()) {
            return true;
        } else {
            C32741f.m132248f().mo95052b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f79435e.set(true);
        try {
            if (mo95015b(thread, th)) {
                this.f79431a.mo94921a(this.f79432b, thread, th);
            } else {
                C32741f.m132248f().mo95052b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            C32741f.m132248f().mo95055e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C32741f.m132248f().mo95052b("Completed exception processing. Invoking default exception handler.");
            this.f79433c.uncaughtException(thread, th);
            this.f79435e.set(false);
            throw th2;
        }
        C32741f.m132248f().mo95052b("Completed exception processing. Invoking default exception handler.");
        this.f79433c.uncaughtException(thread, th);
        this.f79435e.set(false);
    }
}
