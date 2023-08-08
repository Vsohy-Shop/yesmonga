package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.l */
public interface C36995l {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.l$a */
    public static final class C36996a implements C36995l {
        @C12579k

        /* renamed from: a */
        public static final C36996a f92404a = new C36996a();

        /* renamed from: b */
        public static final int f92405b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.l$b */
    public static final class C36997b implements C36995l {
        @C12579k

        /* renamed from: a */
        public static final C36997b f92406a = new C36997b();

        /* renamed from: b */
        public static final int f92407b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.l$c */
    public static final class C36998c implements C36995l {
        @C12579k

        /* renamed from: a */
        public static final C36998c f92408a = new C36998c();

        /* renamed from: b */
        public static final int f92409b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.l$d */
    public static final class C36999d implements C36995l {
        @C12579k

        /* renamed from: a */
        public static final C36999d f92410a = new C36999d();

        /* renamed from: b */
        public static final int f92411b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.l$e */
    public static final class C37000e implements C36995l {

        /* renamed from: b */
        public static final int f92412b = 0;
        @C12579k

        /* renamed from: a */
        public final String f92413a;

        public C37000e(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "query");
            this.f92413a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37000e m151742c(C37000e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f92413a;
            }
            return eVar.mo112435b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112434a() {
            return this.f92413a;
        }

        @C12579k
        /* renamed from: b */
        public final C37000e mo112435b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "query");
            return new C37000e(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo112436d() {
            return this.f92413a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37000e) && Intrinsics.areEqual((Object) this.f92413a, (Object) ((C37000e) obj).f92413a);
        }

        public int hashCode() {
            return this.f92413a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f92413a;
            return "OnValidSearch(query=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.l$f */
    public static final class C37001f implements C36995l {

        /* renamed from: b */
        public static final int f92414b = 0;
        @C12579k

        /* renamed from: a */
        public final TextFieldValue f92415a;

        public C37001f(@C12579k TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "newTextFieldValue");
            this.f92415a = textFieldValue;
        }

        /* renamed from: c */
        public static /* synthetic */ C37001f m151746c(C37001f fVar, TextFieldValue textFieldValue, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldValue = fVar.f92415a;
            }
            return fVar.mo112441b(textFieldValue);
        }

        @C12579k
        /* renamed from: a */
        public final TextFieldValue mo112440a() {
            return this.f92415a;
        }

        @C12579k
        /* renamed from: b */
        public final C37001f mo112441b(@C12579k TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "newTextFieldValue");
            return new C37001f(textFieldValue);
        }

        @C12579k
        /* renamed from: d */
        public final TextFieldValue mo112442d() {
            return this.f92415a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37001f) && Intrinsics.areEqual((Object) this.f92415a, (Object) ((C37001f) obj).f92415a);
        }

        public int hashCode() {
            return this.f92415a.hashCode();
        }

        @C12579k
        public String toString() {
            TextFieldValue textFieldValue = this.f92415a;
            return "OnValueChange(newTextFieldValue=" + textFieldValue + ")";
        }
    }
}
