package com.carrefour.fid.android.design.components.widgets.productcard.lozenge;

import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.lozenge.a */
public abstract class C37382a {

    /* renamed from: a */
    public static final int f93945a = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.lozenge.a$a */
    public static final class C37383a extends C37382a {

        /* renamed from: c */
        public static final int f93946c = 0;
        @C12579k

        /* renamed from: b */
        public final String f93947b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37383a(@C12579k String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "text");
            this.f93947b = str;
        }

        @C12579k
        /* renamed from: a */
        public final String mo113966a() {
            return this.f93947b;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.lozenge.a$b */
    public static final class C37384b extends C37382a {

        /* renamed from: d */
        public static final int f93948d = 0;

        /* renamed from: b */
        public final int f93949b;

        /* renamed from: c */
        public final int f93950c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37384b(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }

        /* renamed from: a */
        public final int mo113967a() {
            return this.f93949b;
        }

        /* renamed from: b */
        public final int mo113968b() {
            return this.f93950c;
        }

        public C37384b(@C0375v int i, @C0324b1 int i2) {
            super((DefaultConstructorMarker) null);
            this.f93949b = i;
            this.f93950c = i2;
        }
    }

    public /* synthetic */ C37382a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C37382a() {
    }
}
