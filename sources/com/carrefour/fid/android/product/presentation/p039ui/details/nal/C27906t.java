package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.product.C27609f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.t */
public abstract class C27906t {
    @C12579k

    /* renamed from: a */
    public final String f67562a;

    /* renamed from: b */
    public final int f67563b;

    /* renamed from: c */
    public final int f67564c;

    /* renamed from: d */
    public final int f67565d;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.t$a */
    public static final class C27907a extends C27906t {

        /* renamed from: f */
        public static final int f67566f = 0;
        @C12579k

        /* renamed from: e */
        public final String f67567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27907a(@C12579k String str) {
            super(str, C27609f.C27617h.ds_gr_red_error, C27609f.C27615f.ds_red_1, C27609f.C27615f.ds_red_light, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "title");
            this.f67567e = str;
        }

        /* renamed from: g */
        public static /* synthetic */ C27907a m117079g(C27907a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f67567e;
            }
            return aVar.mo81109f(str);
        }

        @C12579k
        /* renamed from: c */
        public String mo81105c() {
            return this.f67567e;
        }

        @C12579k
        /* renamed from: e */
        public final String mo81107e() {
            return this.f67567e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27907a) && Intrinsics.areEqual((Object) this.f67567e, (Object) ((C27907a) obj).f67567e);
        }

        @C12579k
        /* renamed from: f */
        public final C27907a mo81109f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            return new C27907a(str);
        }

        public int hashCode() {
            return this.f67567e.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f67567e;
            return "Error(title=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.t$b */
    public static final class C27908b extends C27906t {

        /* renamed from: f */
        public static final int f67568f = 0;
        @C12579k

        /* renamed from: e */
        public final String f67569e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C27908b(@org.jetbrains.annotations.C12579k java.lang.String r8) {
            /*
                r7 = this;
                java.lang.String r0 = "title"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r3 = com.carrefour.fid.android.product.C27609f.C27617h.ds_dark_gr_check
                int r5 = com.carrefour.fid.android.product.C27609f.C27615f.ds_green_dark
                r6 = 0
                r1 = r7
                r2 = r8
                r4 = r5
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f67569e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27906t.C27908b.<init>(java.lang.String):void");
        }

        /* renamed from: g */
        public static /* synthetic */ C27908b m117083g(C27908b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f67569e;
            }
            return bVar.mo81114f(str);
        }

        @C12579k
        /* renamed from: c */
        public String mo81105c() {
            return this.f67569e;
        }

        @C12579k
        /* renamed from: e */
        public final String mo81112e() {
            return this.f67569e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27908b) && Intrinsics.areEqual((Object) this.f67569e, (Object) ((C27908b) obj).f67569e);
        }

        @C12579k
        /* renamed from: f */
        public final C27908b mo81114f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            return new C27908b(str);
        }

        public int hashCode() {
            return this.f67569e.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f67569e;
            return "Success(title=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.t$c */
    public static final class C27909c extends C27906t {

        /* renamed from: f */
        public static final int f67570f = 0;
        @C12579k

        /* renamed from: e */
        public final String f67571e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27909c(@C12579k String str) {
            super(str, C27609f.C27617h.ds_gr_warning, C27609f.C27615f.ds_orange, C27609f.C27615f.ds_orange_light, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "title");
            this.f67571e = str;
        }

        /* renamed from: g */
        public static /* synthetic */ C27909c m117087g(C27909c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f67571e;
            }
            return cVar.mo81119f(str);
        }

        @C12579k
        /* renamed from: c */
        public String mo81105c() {
            return this.f67571e;
        }

        @C12579k
        /* renamed from: e */
        public final String mo81117e() {
            return this.f67571e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27909c) && Intrinsics.areEqual((Object) this.f67571e, (Object) ((C27909c) obj).f67571e);
        }

        @C12579k
        /* renamed from: f */
        public final C27909c mo81119f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            return new C27909c(str);
        }

        public int hashCode() {
            return this.f67571e.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f67571e;
            return "Warning(title=" + str + ")";
        }
    }

    public /* synthetic */ C27906t(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3);
    }

    /* renamed from: a */
    public final int mo81103a() {
        return this.f67563b;
    }

    /* renamed from: b */
    public final int mo81104b() {
        return this.f67565d;
    }

    @C12579k
    /* renamed from: c */
    public String mo81105c() {
        return this.f67562a;
    }

    /* renamed from: d */
    public final int mo81106d() {
        return this.f67564c;
    }

    public C27906t(String str, int i, int i2, int i3) {
        this.f67562a = str;
        this.f67563b = i;
        this.f67564c = i2;
        this.f67565d = i3;
    }
}
