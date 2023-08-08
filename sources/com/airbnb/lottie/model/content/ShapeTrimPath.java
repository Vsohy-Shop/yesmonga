package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21464t;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.layer.C21578a;

public class ShapeTrimPath implements C21562b {

    /* renamed from: a */
    public final String f55676a;

    /* renamed from: b */
    public final Type f55677b;

    /* renamed from: c */
    public final C21544b f55678c;

    /* renamed from: d */
    public final C21544b f55679d;

    /* renamed from: e */
    public final C21544b f55680e;

    /* renamed from: f */
    public final boolean f55681f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: b */
        public static Type m99345b(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public ShapeTrimPath(String str, Type type, C21544b bVar, C21544b bVar2, C21544b bVar3, boolean z) {
        this.f55676a = str;
        this.f55677b = type;
        this.f55678c = bVar;
        this.f55679d = bVar2;
        this.f55680e = bVar3;
        this.f55681f = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21464t(aVar, this);
    }

    /* renamed from: b */
    public C21544b mo64357b() {
        return this.f55679d;
    }

    /* renamed from: c */
    public String mo64358c() {
        return this.f55676a;
    }

    /* renamed from: d */
    public C21544b mo64359d() {
        return this.f55680e;
    }

    /* renamed from: e */
    public C21544b mo64360e() {
        return this.f55678c;
    }

    /* renamed from: f */
    public Type mo64361f() {
        return this.f55677b;
    }

    /* renamed from: g */
    public boolean mo64362g() {
        return this.f55681f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f55678c + ", end: " + this.f55679d + ", offset: " + this.f55680e + "}";
    }
}
