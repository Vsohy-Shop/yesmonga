package com.carrefour.fid.android.shared.base;

import androidx.annotation.C0346i;
import androidx.compose.runtime.internal.C8567o;
import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 1)
/* renamed from: com.carrefour.fid.android.shared.base.f */
public abstract class C28484f<T> {
    @C12579k

    /* renamed from: d */
    public static final C28485a f68629d = new C28485a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f68630e = 0;

    /* renamed from: f */
    public static final long f68631f = -1;

    /* renamed from: a */
    public final T f68632a;

    /* renamed from: b */
    public final long f68633b;

    /* renamed from: c */
    public final long f68634c;

    /* renamed from: com.carrefour.fid.android.shared.base.f$a */
    public static final class C28485a {
        public /* synthetic */ C28485a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28485a() {
        }
    }

    public C28484f(T t, long j) {
        this.f68632a = t;
        this.f68633b = j;
        this.f68634c = Calendar.getInstance().getTimeInMillis();
    }

    /* renamed from: a */
    public final T mo83403a() {
        return this.f68632a;
    }

    /* renamed from: b */
    public final T mo83404b() {
        return this.f68632a;
    }

    @C0346i
    /* renamed from: c */
    public boolean mo83405c() {
        return this.f68633b < 0 || Calendar.getInstance().getTimeInMillis() - this.f68634c < this.f68633b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28484f(Object obj, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? -1 : j);
    }
}
