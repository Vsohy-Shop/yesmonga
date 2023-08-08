package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.iam.banner.C9156c;
import com.urbanairship.json.C9323b;

/* renamed from: com.urbanairship.android.layout.property.k */
public class C35840k {

    /* renamed from: e */
    public static C35840k f88597e = new C35840k(0, 0, 0, 0);

    /* renamed from: a */
    public final int f88598a;

    /* renamed from: b */
    public final int f88599b;

    /* renamed from: c */
    public final int f88600c;

    /* renamed from: d */
    public final int f88601d;

    public C35840k(int i, int i2, int i3, int i4) {
        this.f88598a = i;
        this.f88599b = i2;
        this.f88600c = i3;
        this.f88601d = i4;
    }

    @C0359n0
    /* renamed from: a */
    public static C35840k m147768a(@C0359n0 C9323b bVar) {
        return new C35840k(bVar.mo18801A(C9156c.f24820X).mo18762f(0), bVar.mo18801A(C9156c.f24821Y).mo18762f(0), bVar.mo18801A("start").mo18762f(0), bVar.mo18801A("end").mo18762f(0));
    }

    /* renamed from: b */
    public int mo107345b() {
        return this.f88599b;
    }

    /* renamed from: c */
    public int mo107346c() {
        return this.f88601d;
    }

    /* renamed from: d */
    public int mo107347d() {
        return this.f88600c;
    }

    /* renamed from: e */
    public int mo107348e() {
        return this.f88598a;
    }
}
