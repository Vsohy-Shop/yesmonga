package com.carrefour.fid.android.domain.models.offer;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11288f
/* renamed from: com.carrefour.fid.android.domain.models.offer.d */
public final class C38067d {
    @C12579k

    /* renamed from: b */
    public static final C38068a f96183b = new C38068a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f96184a;

    /* renamed from: com.carrefour.fid.android.domain.models.offer.d$a */
    public static final class C38068a {
        public /* synthetic */ C38068a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final C38067d mo118207a(@C12580l Integer num) {
            if (num != null) {
                return C38067d.m157174a(C38067d.m157175b(num.intValue()));
            }
            return null;
        }

        public C38068a() {
        }
    }

    public /* synthetic */ C38067d(int i) {
        this.f96184a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C38067d m157174a(int i) {
        return new C38067d(i);
    }

    /* renamed from: b */
    public static int m157175b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m157176c(int i, Object obj) {
        return (obj instanceof C38067d) && i == ((C38067d) obj).mo118204h();
    }

    /* renamed from: d */
    public static final boolean m157177d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m157178f(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: g */
    public static String m157179g(int i) {
        return "Price(value=" + i + ")";
    }

    /* renamed from: e */
    public final int mo118202e() {
        return this.f96184a;
    }

    public boolean equals(Object obj) {
        return m157176c(this.f96184a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ int mo118204h() {
        return this.f96184a;
    }

    public int hashCode() {
        return m157178f(this.f96184a);
    }

    public String toString() {
        return m157179g(this.f96184a);
    }
}
