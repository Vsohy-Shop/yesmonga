package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.i */
public abstract class C27864i {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.i$a */
    public static final class C27865a extends C27864i {
        @C12579k

        /* renamed from: a */
        public static final C27865a f67482a = new C27865a();

        /* renamed from: b */
        public static final int f67483b = 0;

        public C27865a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.i$b */
    public static final class C27866b extends C27864i {

        /* renamed from: c */
        public static final int f67484c = 0;

        /* renamed from: a */
        public final int f67485a;

        /* renamed from: b */
        public final int f67486b;

        public C27866b(int i, int i2) {
            super((DefaultConstructorMarker) null);
            this.f67485a = i;
            this.f67486b = i2;
        }

        /* renamed from: d */
        public static /* synthetic */ C27866b m116944d(C27866b bVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bVar.f67485a;
            }
            if ((i3 & 2) != 0) {
                i2 = bVar.f67486b;
            }
            return bVar.mo80954c(i, i2);
        }

        /* renamed from: a */
        public final int mo80952a() {
            return this.f67485a;
        }

        /* renamed from: b */
        public final int mo80953b() {
            return this.f67486b;
        }

        @C12579k
        /* renamed from: c */
        public final C27866b mo80954c(int i, int i2) {
            return new C27866b(i, i2);
        }

        /* renamed from: e */
        public final int mo80955e() {
            return this.f67486b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27866b)) {
                return false;
            }
            C27866b bVar = (C27866b) obj;
            return this.f67485a == bVar.f67485a && this.f67486b == bVar.f67486b;
        }

        /* renamed from: f */
        public final int mo80957f() {
            return this.f67485a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f67485a) * 31) + Integer.hashCode(this.f67486b);
        }

        @C12579k
        public String toString() {
            int i = this.f67485a;
            int i2 = this.f67486b;
            return "ModalQuantity(quantity=" + i + ", maxQuantity=" + i2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.i$c */
    public static final class C27867c extends C27864i {
        @C12579k

        /* renamed from: a */
        public static final C27867c f67487a = new C27867c();

        /* renamed from: b */
        public static final int f67488b = 0;

        public C27867c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.i$d */
    public static final class C27868d extends C27864i {
        @C12579k

        /* renamed from: a */
        public static final C27868d f67489a = new C27868d();

        /* renamed from: b */
        public static final int f67490b = 0;

        public C27868d() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.i$e */
    public static final class C27869e extends C27864i {
        @C12579k

        /* renamed from: a */
        public static final C27869e f67491a = new C27869e();

        /* renamed from: b */
        public static final int f67492b = 0;

        public C27869e() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C27864i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C27864i() {
    }
}
