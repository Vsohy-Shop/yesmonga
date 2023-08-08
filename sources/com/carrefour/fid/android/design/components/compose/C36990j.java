package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.j */
public interface C36990j {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.j$a */
    public static final class C36991a implements C36990j {

        /* renamed from: b */
        public static final int f92396b = 0;
        @C12579k

        /* renamed from: a */
        public final String f92397a;

        public C36991a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "memoToAdd");
            this.f92397a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C36991a m151730c(C36991a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f92397a;
            }
            return aVar.mo112417b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112416a() {
            return this.f92397a;
        }

        @C12579k
        /* renamed from: b */
        public final C36991a mo112417b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "memoToAdd");
            return new C36991a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo112418d() {
            return this.f92397a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36991a) && Intrinsics.areEqual((Object) this.f92397a, (Object) ((C36991a) obj).f92397a);
        }

        public int hashCode() {
            return this.f92397a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f92397a;
            return "OnMemoAddClick(memoToAdd=" + str + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.j$b */
    public static final class C36992b implements C36990j {
        @C12579k

        /* renamed from: a */
        public static final C36992b f92398a = new C36992b();

        /* renamed from: b */
        public static final int f92399b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.compose.j$c */
    public static final class C36993c implements C36990j {

        /* renamed from: b */
        public static final int f92400b = 0;
        @C12579k

        /* renamed from: a */
        public final TextFieldValue f92401a;

        public C36993c(@C12579k TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "newTextFieldValue");
            this.f92401a = textFieldValue;
        }

        /* renamed from: c */
        public static /* synthetic */ C36993c m151734c(C36993c cVar, TextFieldValue textFieldValue, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldValue = cVar.f92401a;
            }
            return cVar.mo112423b(textFieldValue);
        }

        @C12579k
        /* renamed from: a */
        public final TextFieldValue mo112422a() {
            return this.f92401a;
        }

        @C12579k
        /* renamed from: b */
        public final C36993c mo112423b(@C12579k TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "newTextFieldValue");
            return new C36993c(textFieldValue);
        }

        @C12579k
        /* renamed from: d */
        public final TextFieldValue mo112424d() {
            return this.f92401a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36993c) && Intrinsics.areEqual((Object) this.f92401a, (Object) ((C36993c) obj).f92401a);
        }

        public int hashCode() {
            return this.f92401a.hashCode();
        }

        @C12579k
        public String toString() {
            TextFieldValue textFieldValue = this.f92401a;
            return "OnValueChange(newTextFieldValue=" + textFieldValue + ")";
        }
    }
}
