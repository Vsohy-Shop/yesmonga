package com.carrefour.fid.android.design.components.type;

import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.type.b */
public abstract class C37130b {

    /* renamed from: a */
    public static final int f92963a = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.type.b$a */
    public static final class C37131a extends C37130b {

        /* renamed from: c */
        public static final int f92964c = 8;
        @C12579k

        /* renamed from: b */
        public final CharSequence f92965b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37131a(@C12579k CharSequence charSequence) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(charSequence, "text");
            this.f92965b = charSequence;
        }

        @C12579k
        /* renamed from: a */
        public final CharSequence mo112749a() {
            return this.f92965b;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.type.b$b */
    public static final class C37132b extends C37130b {

        /* renamed from: c */
        public static final int f92966c = 0;

        /* renamed from: b */
        public final int f92967b;

        public C37132b(@C0324b1 int i) {
            super((DefaultConstructorMarker) null);
            this.f92967b = i;
        }

        /* renamed from: a */
        public final int mo112750a() {
            return this.f92967b;
        }
    }

    public /* synthetic */ C37130b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C37130b() {
    }
}
