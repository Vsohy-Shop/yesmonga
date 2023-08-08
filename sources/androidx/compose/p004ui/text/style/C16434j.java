package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.text.C16163e0;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.style.j */
public final class C16434j {
    @C12579k

    /* renamed from: b */
    public static final C16435a f40726b = new C16435a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40727c = 0;
    @C12579k

    /* renamed from: d */
    public static final C16434j f40728d = new C16434j(0);
    @C12579k

    /* renamed from: e */
    public static final C16434j f40729e = new C16434j(1);
    @C12579k

    /* renamed from: f */
    public static final C16434j f40730f = new C16434j(2);

    /* renamed from: a */
    public final int f40731a;

    @C11363r0({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n108#2,3:112\n111#2,2:119\n113#2:122\n33#3,4:115\n38#3:121\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:119,2\n57#1:122\n57#1:115,4\n57#1:121\n*E\n"})
    /* renamed from: androidx.compose.ui.text.style.j$a */
    public static final class C16435a {
        public /* synthetic */ C16435a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: c */
        public static /* synthetic */ void m74192c() {
        }

        @C8547h2
        /* renamed from: e */
        public static /* synthetic */ void m74193e() {
        }

        @C8547h2
        /* renamed from: g */
        public static /* synthetic */ void m74194g() {
        }

        @C12579k
        /* renamed from: a */
        public final C16434j mo47680a(@C12579k List<C16434j> list) {
            Intrinsics.checkNotNullParameter(list, "decorations");
            Integer num = 0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                num = Integer.valueOf(num.intValue() | list.get(i).mo47675e());
            }
            return new C16434j(num.intValue());
        }

        @C12579k
        /* renamed from: b */
        public final C16434j mo47681b() {
            return C16434j.f40730f;
        }

        @C12579k
        /* renamed from: d */
        public final C16434j mo47682d() {
            return C16434j.f40728d;
        }

        @C12579k
        /* renamed from: f */
        public final C16434j mo47683f() {
            return C16434j.f40729e;
        }

        public C16435a() {
        }
    }

    public C16434j(int i) {
        this.f40731a = i;
    }

    /* renamed from: d */
    public final boolean mo47674d(@C12579k C16434j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "other");
        int i = this.f40731a;
        if ((jVar.f40731a | i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo47675e() {
        return this.f40731a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16434j) && this.f40731a == ((C16434j) obj).f40731a) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final C16434j mo47677f(@C12579k C16434j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "decoration");
        return new C16434j(jVar.f40731a | this.f40731a);
    }

    public int hashCode() {
        return this.f40731a;
    }

    @C12579k
    public String toString() {
        if (this.f40731a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f40731a & f40729e.f40731a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f40731a & f40730f.f40731a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + C16163e0.m72807l(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null) + C12361b.f30261l;
    }
}
