package androidx.compose.p004ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16176a0;
import androidx.compose.p004ui.text.font.C16187d0;
import androidx.compose.p004ui.text.font.C16198g0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C11395k;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "This is not supported after downloadable fonts.")
@C11363r0({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n35#2,3:175\n38#2,2:182\n40#2:185\n56#2,4:197\n60#2,3:205\n63#2:209\n33#3,4:178\n38#3:184\n151#3,3:186\n33#3,4:189\n154#3,2:193\n38#3:195\n156#3:196\n33#3,4:201\n38#3:208\n33#3,6:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n67#1:175,3\n67#1:182,2\n67#1:185\n72#1:197,4\n72#1:205,3\n72#1:209\n67#1:178,4\n67#1:184\n70#1:186,3\n70#1:189,4\n70#1:193,2\n70#1:195\n70#1:196\n72#1:201,4\n72#1:208\n80#1:210,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.c */
public final class C16366c implements C16385n {
    @C12579k

    /* renamed from: d */
    public static final C16367a f40625d = new C16367a((DefaultConstructorMarker) null);
    @Deprecated
    @C12579k

    /* renamed from: e */
    public static final C16187d0 f40626e = new C16187d0();
    @C12579k

    /* renamed from: a */
    public final C16187d0 f40627a;
    @C12579k

    /* renamed from: b */
    public final Map<C16238t, Typeface> f40628b;
    @C12579k

    /* renamed from: c */
    public final C16242u f40629c;

    /* renamed from: androidx.compose.ui.text.platform.c$a */
    public static final class C16367a {
        public /* synthetic */ C16367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16187d0 mo47536a() {
            return C16366c.f40626e;
        }

        public C16367a() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16366c(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16176a0 r8, @org.jetbrains.annotations.C12579k android.content.Context r9, @org.jetbrains.annotations.C12580l java.util.List<kotlin.Pair<androidx.compose.p004ui.text.font.C16209i0, androidx.compose.p004ui.text.font.C16190e0>> r10, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16187d0 r11) {
        /*
            r7 = this;
            java.lang.String r0 = "fontFamily"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "fontMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r7.<init>()
            r7.f40627a = r11
            java.util.List r11 = r8.mo46822X()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        L_0x0027:
            if (r3 >= r1) goto L_0x0046
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.t r5 = (androidx.compose.p004ui.text.font.C16238t) r5
            int r5 = r5.mo46868a()
            androidx.compose.ui.text.font.c0$a r6 = androidx.compose.p004ui.text.font.C16182c0.f40243b
            int r6 = r6.mo46866b()
            boolean r5 = androidx.compose.p004ui.text.font.C16182c0.m72919g(r5, r6)
            if (r5 == 0) goto L_0x0043
            r0.add(r4)
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x0046:
            if (r10 == 0) goto L_0x00b2
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = r2
        L_0x0056:
            if (r3 >= r1) goto L_0x0080
            java.lang.Object r4 = r10.get(r3)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.mo21846a()
            androidx.compose.ui.text.font.i0 r5 = (androidx.compose.p004ui.text.font.C16209i0) r5
            java.lang.Object r4 = r4.mo21847b()
            androidx.compose.ui.text.font.e0 r4 = (androidx.compose.p004ui.text.font.C16190e0) r4
            int r4 = r4.mo46880j()
            androidx.compose.ui.text.font.d0 r6 = r7.f40627a
            java.util.List r4 = r6.mo46876e(r0, r5, r4)
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r4)
            androidx.compose.ui.text.font.t r4 = (androidx.compose.p004ui.text.font.C16238t) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L_0x0056
        L_0x0080:
            java.util.List r10 = androidx.compose.p004ui.text.C16163e0.m72801f(r11)
            if (r10 == 0) goto L_0x00b2
            java.util.HashSet r11 = new java.util.HashSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = r2
        L_0x009d:
            if (r4 >= r3) goto L_0x00b3
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.t r6 = (androidx.compose.p004ui.text.font.C16238t) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto L_0x00af
            r1.add(r5)
        L_0x00af:
            int r4 = r4 + 1
            goto L_0x009d
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            if (r1 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x00f6
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        L_0x00c6:
            if (r2 >= r11) goto L_0x00f1
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.t r1 = (androidx.compose.p004ui.text.font.C16238t) r1
            androidx.compose.ui.text.platform.o r3 = androidx.compose.p004ui.text.platform.C16386o.f40639a     // Catch:{ Exception -> 0x00da }
            android.graphics.Typeface r3 = r3.mo47557b(r9, r1)     // Catch:{ Exception -> 0x00da }
            r10.put(r1, r3)     // Catch:{ Exception -> 0x00da }
            int r2 = r2 + 1
            goto L_0x00c6
        L_0x00da:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot create Typeface from "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00f1:
            r7.f40628b = r10
            r7.f40629c = r8
            return
        L_0x00f6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not match font"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.platform.C16366c.<init>(androidx.compose.ui.text.font.a0, android.content.Context, java.util.List, androidx.compose.ui.text.font.d0):void");
    }

    @C12579k
    /* renamed from: a */
    public C16242u mo47020a() {
        return this.f40629c;
    }

    @C12579k
    /* renamed from: b */
    public Typeface mo47534b(@C12579k C16209i0 i0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        C16238t tVar = (C16238t) CollectionsKt___CollectionsKt.m40479B2(this.f40627a.mo46876e(new ArrayList(this.f40628b.keySet()), i0Var, i));
        if (tVar != null) {
            Typeface typeface = this.f40628b.get(tVar);
            if (typeface != null) {
                Object a = C16198g0.m72983a(i2, typeface, tVar, i0Var, i);
                Intrinsics.checkNotNull(a, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Could not load font");
    }

    @C12579k
    /* renamed from: d */
    public final C16187d0 mo47535d() {
        return this.f40627a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16366c(C16176a0 a0Var, Context context, List list, C16187d0 d0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? f40626e : d0Var);
    }
}
