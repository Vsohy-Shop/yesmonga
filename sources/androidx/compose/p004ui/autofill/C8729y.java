package androidx.compose.p004ui.autofill;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8761g
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.autofill.y */
public final class C8729y {
    @C12579k

    /* renamed from: e */
    public static final C8730a f23397e = new C8730a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f23398f = 8;

    /* renamed from: g */
    public static int f23399g;
    @C12579k

    /* renamed from: a */
    public final List<AutofillType> f23400a;
    @C12580l

    /* renamed from: b */
    public C15098i f23401b;
    @C12580l

    /* renamed from: c */
    public final C11300l<String, C11079d2> f23402c;

    /* renamed from: d */
    public final int f23403d;

    @C11363r0({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,104:1\n34#2:105\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:105\n*E\n"})
    /* renamed from: androidx.compose.ui.autofill.y$a */
    public static final class C8730a {
        public /* synthetic */ C8730a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final int mo17054b() {
            int a;
            synchronized (this) {
                C8730a aVar = C8729y.f23397e;
                C8729y.f23399g = C8729y.f23399g + 1;
                a = C8729y.f23399g;
            }
            return a;
        }

        public C8730a() {
        }
    }

    public C8729y(@C12579k List<? extends AutofillType> list, @C12580l C15098i iVar, @C12580l C11300l<? super String, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(list, "autofillTypes");
        this.f23400a = list;
        this.f23401b = iVar;
        this.f23402c = lVar;
        this.f23403d = f23397e.mo17054b();
    }

    @C12579k
    /* renamed from: c */
    public final List<AutofillType> mo17047c() {
        return this.f23400a;
    }

    @C12580l
    /* renamed from: d */
    public final C15098i mo17048d() {
        return this.f23401b;
    }

    /* renamed from: e */
    public final int mo17049e() {
        return this.f23403d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8729y)) {
            return false;
        }
        C8729y yVar = (C8729y) obj;
        if (Intrinsics.areEqual((Object) this.f23400a, (Object) yVar.f23400a) && Intrinsics.areEqual((Object) this.f23401b, (Object) yVar.f23401b) && Intrinsics.areEqual((Object) this.f23402c, (Object) yVar.f23402c)) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: f */
    public final C11300l<String, C11079d2> mo17051f() {
        return this.f23402c;
    }

    /* renamed from: g */
    public final void mo17052g(@C12580l C15098i iVar) {
        this.f23401b = iVar;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f23400a.hashCode() * 31;
        C15098i iVar = this.f23401b;
        int i2 = 0;
        if (iVar != null) {
            i = iVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        C11300l<String, C11079d2> lVar = this.f23402c;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return i3 + i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8729y(List list, C15098i iVar, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 2) != 0 ? null : iVar, lVar);
    }
}
