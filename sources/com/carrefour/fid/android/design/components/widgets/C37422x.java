package com.carrefour.fid.android.design.components.widgets;

import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.x */
public abstract class C37422x {

    /* renamed from: a */
    public static final int f94036a = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.x$a */
    public static final class C37423a extends C37422x {

        /* renamed from: c */
        public static final int f94037c = 8;
        @C12579k

        /* renamed from: b */
        public final List<C37409t> f94038b;

        public C37423a() {
            this((List) null, 1, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: a */
        public final List<C37409t> mo114070a() {
            return this.f94038b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37423a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37423a(@C12579k List<C37409t> list) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(list, "previewProducts");
            this.f94038b = list;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.x$c */
    public static final class C37425c extends C37422x {
        @C12579k

        /* renamed from: b */
        public static final C37425c f94046b = new C37425c();

        /* renamed from: c */
        public static final int f94047c = 0;

        public C37425c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.x$d */
    public static final class C37426d extends C37422x {

        /* renamed from: c */
        public static final int f94048c = 8;
        @C12579k

        /* renamed from: b */
        public final List<C37409t> f94049b;

        public C37426d() {
            this((List) null, 1, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: a */
        public final List<C37409t> mo114077a() {
            return this.f94049b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37426d(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37426d(@C12579k List<C37409t> list) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(list, "previewProducts");
            this.f94049b = list;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.x$e */
    public static final class C37427e extends C37422x {
        @C12579k

        /* renamed from: b */
        public static final C37427e f94050b = new C37427e();

        /* renamed from: c */
        public static final int f94051c = 0;

        public C37427e() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C37422x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.x$b */
    public static final class C37424b extends C37422x {

        /* renamed from: h */
        public static final int f94039h = 8;
        @C12579k

        /* renamed from: b */
        public final String f94040b;
        @C12579k

        /* renamed from: c */
        public final String f94041c;
        @C12579k

        /* renamed from: d */
        public final String f94042d;

        /* renamed from: e */
        public final int f94043e;
        @C12579k

        /* renamed from: f */
        public final List<C37409t> f94044f;
        @C12580l

        /* renamed from: g */
        public final C11289a<C11079d2> f94045g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37424b(String str, String str2, String str3, int i, List list, C11289a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, i, (i2 & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, aVar);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114071a() {
            return this.f94042d;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114072b() {
            return this.f94041c;
        }

        @C12580l
        /* renamed from: c */
        public final C11289a<C11079d2> mo114073c() {
            return this.f94045g;
        }

        @C12579k
        /* renamed from: d */
        public final String mo114074d() {
            return this.f94040b;
        }

        @C12579k
        /* renamed from: e */
        public final List<C37409t> mo114075e() {
            return this.f94044f;
        }

        /* renamed from: f */
        public final int mo114076f() {
            return this.f94043e;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37424b(@C12579k String str, @C12579k String str2, @C12579k String str3, int i, @C12579k List<C37409t> list, @C12580l C11289a<C11079d2> aVar) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "date");
            Intrinsics.checkNotNullParameter(str3, "amount");
            Intrinsics.checkNotNullParameter(list, "previewProducts");
            this.f94040b = str;
            this.f94041c = str2;
            this.f94042d = str3;
            this.f94043e = i;
            this.f94044f = list;
            this.f94045g = aVar;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.x$f */
    public static final class C37428f extends C37422x {

        /* renamed from: d */
        public static final int f94052d = 8;

        /* renamed from: b */
        public final int f94053b;
        @C12579k

        /* renamed from: c */
        public final List<C37409t> f94054c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37428f(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }

        @C12579k
        /* renamed from: a */
        public final List<C37409t> mo114078a() {
            return this.f94054c;
        }

        /* renamed from: b */
        public final int mo114079b() {
            return this.f94053b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37428f(int i, @C12579k List<C37409t> list) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(list, "previewProducts");
            this.f94053b = i;
            this.f94054c = list;
        }
    }

    public C37422x() {
    }
}
