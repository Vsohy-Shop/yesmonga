package com.contentsquare.android.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.api.model.a */
public final class C14096a extends C14100c {

    /* renamed from: g */
    public static final long f34863g = 0;

    /* renamed from: h */
    public static final long f34864h = 4294967295L;

    /* renamed from: i */
    public static final C14097a f34865i = new C14097a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public final long f34866f;

    /* renamed from: com.contentsquare.android.api.model.a$a */
    public static final class C14097a {
        public C14097a() {
        }

        public /* synthetic */ C14097a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14096a(String str, long j) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "key");
        long j2 = 0;
        if (j < 0) {
            C14100c.f34874e.mo34345a().mo35679i("Dynamic Variable value is negative. Dynamic Variable is sent but the value is set to %d", 0L);
        } else {
            j2 = 4294967295L;
            if (j > 4294967295L) {
                C14100c.f34874e.mo34345a().mo35679i("Dynamic Variable value is too big: the current input has a size of %d while the limit is %d. Dynamic Variable is sent but the value truncated", Long.valueOf(j), 4294967295L);
            } else {
                this.f34866f = j;
                return;
            }
        }
        this.f34866f = j2;
    }

    /* renamed from: d */
    public final long mo34342d() {
        return this.f34866f;
    }
}
