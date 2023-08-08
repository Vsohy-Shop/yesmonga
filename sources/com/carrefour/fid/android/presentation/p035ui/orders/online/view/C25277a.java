package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.a */
public abstract class C25277a {

    /* renamed from: d */
    public static final int f62342d = 0;

    /* renamed from: a */
    public final int f62343a;

    /* renamed from: b */
    public final int f62344b;

    /* renamed from: c */
    public final int f62345c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.a$a */
    public static final class C25278a extends C25277a {

        /* renamed from: e */
        public final int f62346e;

        public C25278a() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public static /* synthetic */ C25278a m109388f(C25278a aVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f62346e;
            }
            return aVar.mo73729e(i);
        }

        /* renamed from: a */
        public int mo73725a() {
            return this.f62346e;
        }

        /* renamed from: d */
        public final int mo73728d() {
            return this.f62346e;
        }

        @C12579k
        /* renamed from: e */
        public final C25278a mo73729e(int i) {
            return new C25278a(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25278a) && this.f62346e == ((C25278a) obj).f62346e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f62346e);
        }

        @C12579k
        public String toString() {
            int i = this.f62346e;
            return "Error(backgroundColor=" + i + ")";
        }

        public C25278a(int i) {
            super(R.drawable.ds_gr_red_error, i, R.color.ds_red_1, (DefaultConstructorMarker) null);
            this.f62346e = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25278a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.color.ds_red_extra_light : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.a$b */
    public static final class C25279b extends C25277a {

        /* renamed from: e */
        public final int f62347e;

        public C25279b() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public static /* synthetic */ C25279b m109392f(C25279b bVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f62347e;
            }
            return bVar.mo73734e(i);
        }

        /* renamed from: a */
        public int mo73725a() {
            return this.f62347e;
        }

        /* renamed from: d */
        public final int mo73733d() {
            return this.f62347e;
        }

        @C12579k
        /* renamed from: e */
        public final C25279b mo73734e(int i) {
            return new C25279b(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25279b) && this.f62347e == ((C25279b) obj).f62347e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f62347e);
        }

        @C12579k
        public String toString() {
            int i = this.f62347e;
            return "Info(backgroundColor=" + i + ")";
        }

        public C25279b(int i) {
            super(R.drawable.ds_gr_blue_info, i, R.color.ds_primary, (DefaultConstructorMarker) null);
            this.f62347e = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25279b(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.color.ds_blue_extra_light : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.a$c */
    public static final class C25280c extends C25277a {

        /* renamed from: e */
        public final int f62348e;

        public C25280c() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public static /* synthetic */ C25280c m109396f(C25280c cVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cVar.f62348e;
            }
            return cVar.mo73739e(i);
        }

        /* renamed from: a */
        public int mo73725a() {
            return this.f62348e;
        }

        /* renamed from: d */
        public final int mo73738d() {
            return this.f62348e;
        }

        @C12579k
        /* renamed from: e */
        public final C25280c mo73739e(int i) {
            return new C25280c(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25280c) && this.f62348e == ((C25280c) obj).f62348e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f62348e);
        }

        @C12579k
        public String toString() {
            int i = this.f62348e;
            return "Success(backgroundColor=" + i + ")";
        }

        public C25280c(int i) {
            super(R.drawable.ds_gr_check, i, R.color.ds_green, (DefaultConstructorMarker) null);
            this.f62348e = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25280c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.color.ds_green_extra_light : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.a$d */
    public static final class C25281d extends C25277a {

        /* renamed from: e */
        public final int f62349e;

        public C25281d() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public static /* synthetic */ C25281d m109400f(C25281d dVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dVar.f62349e;
            }
            return dVar.mo73744e(i);
        }

        /* renamed from: a */
        public int mo73725a() {
            return this.f62349e;
        }

        /* renamed from: d */
        public final int mo73743d() {
            return this.f62349e;
        }

        @C12579k
        /* renamed from: e */
        public final C25281d mo73744e(int i) {
            return new C25281d(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25281d) && this.f62349e == ((C25281d) obj).f62349e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f62349e);
        }

        @C12579k
        public String toString() {
            int i = this.f62349e;
            return "Warning(backgroundColor=" + i + ")";
        }

        public C25281d(int i) {
            super(R.drawable.ds_gr_warning, i, R.color.ds_orange, (DefaultConstructorMarker) null);
            this.f62349e = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25281d(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.color.ds_orange_extra_light : i);
        }
    }

    public /* synthetic */ C25277a(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    /* renamed from: a */
    public int mo73725a() {
        return this.f62344b;
    }

    /* renamed from: b */
    public final int mo73726b() {
        return this.f62343a;
    }

    /* renamed from: c */
    public final int mo73727c() {
        return this.f62345c;
    }

    public C25277a(@C0375v int i, @C0358n int i2, @C0358n int i3) {
        this.f62343a = i;
        this.f62344b = i2;
        this.f62345c = i3;
    }
}
