package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.firebase.crashlytics.internal.common.m */
public class C32710m {

    /* renamed from: a */
    public final String f79415a;

    /* renamed from: b */
    public final C32921f f79416b;

    public C32710m(String str, C32921f fVar) {
        this.f79415a = str;
        this.f79416b = fVar;
    }

    /* renamed from: a */
    public boolean mo94985a() {
        try {
            return mo94986b().createNewFile();
        } catch (IOException e) {
            C32741f f = C32741f.m132248f();
            f.mo95055e("Error creating marker: " + this.f79415a, e);
            return false;
        }
    }

    /* renamed from: b */
    public final File mo94986b() {
        return this.f79416b.mo95568f(this.f79415a);
    }

    /* renamed from: c */
    public boolean mo94987c() {
        return mo94986b().exists();
    }

    /* renamed from: d */
    public boolean mo94988d() {
        return mo94986b().delete();
    }
}
