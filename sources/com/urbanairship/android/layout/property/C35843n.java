package com.urbanairship.android.layout.property;

import androidx.annotation.C0359n0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;

/* renamed from: com.urbanairship.android.layout.property.n */
public class C35843n {
    @C0359n0

    /* renamed from: a */
    public final HorizontalPosition f88611a;
    @C0359n0

    /* renamed from: b */
    public final VerticalPosition f88612b;

    public C35843n(@C0359n0 HorizontalPosition horizontalPosition, @C0359n0 VerticalPosition verticalPosition) {
        this.f88611a = horizontalPosition;
        this.f88612b = verticalPosition;
    }

    @C0359n0
    /* renamed from: a */
    public static C35843n m147785a(@C0359n0 C9323b bVar) throws JsonException {
        return new C35843n(HorizontalPosition.m147662b(bVar.mo18801A("horizontal").mo18750B()), VerticalPosition.m147720b(bVar.mo18801A("vertical").mo18750B()));
    }

    /* renamed from: b */
    public int mo107357b() {
        return this.f88611a.mo107274g() | 17 | this.f88612b.mo107322g();
    }

    @C0359n0
    /* renamed from: c */
    public HorizontalPosition mo107358c() {
        return this.f88611a;
    }

    @C0359n0
    /* renamed from: d */
    public VerticalPosition mo107359d() {
        return this.f88612b;
    }
}
