package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.runtime.C8578k2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,248:1\n151#2,3:249\n33#2,4:252\n154#2,2:256\n38#2:258\n156#2:259\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:249,3\n47#1:252,4\n47#1:256,2\n47#1:258\n47#1:259\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl */
public final class FontFamilyResolverImpl implements C16242u.C16244b {
    @C12579k

    /* renamed from: a */
    public final C16227o0 f40215a;
    @C12579k

    /* renamed from: b */
    public final C16229p0 f40216b;
    @C12579k

    /* renamed from: c */
    public final TypefaceRequestCache f40217c;
    @C12579k

    /* renamed from: d */
    public final FontListFontFamilyTypefaceAdapter f40218d;
    @C12579k

    /* renamed from: e */
    public final C16225n0 f40219e;
    @C12579k

    /* renamed from: f */
    public final C11300l<C16214j1, Object> f40220f;

    public FontFamilyResolverImpl(@C12579k C16227o0 o0Var, @C12579k C16229p0 p0Var, @C12579k TypefaceRequestCache typefaceRequestCache, @C12579k FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, @C12579k C16225n0 n0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "platformFontLoader");
        Intrinsics.checkNotNullParameter(p0Var, "platformResolveInterceptor");
        Intrinsics.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        Intrinsics.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        Intrinsics.checkNotNullParameter(n0Var, "platformFamilyTypefaceAdapter");
        this.f40215a = o0Var;
        this.f40216b = p0Var;
        this.f40217c = typefaceRequestCache;
        this.f40218d = fontListFontFamilyTypefaceAdapter;
        this.f40219e = n0Var;
        this.f40220f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[LOOP:0: B:21:0x006a->B:22:0x006c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo46783a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16242u r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof androidx.compose.p004ui.text.font.FontFamilyResolverImpl$preload$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = (androidx.compose.p004ui.text.font.FontFamilyResolverImpl$preload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r14 = r0.L$1
            androidx.compose.ui.text.font.u r14 = (androidx.compose.p004ui.text.font.C16242u) r14
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.p004ui.text.font.FontFamilyResolverImpl) r0
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0055
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0039:
            kotlin.C11661u0.m45747n(r15)
            boolean r15 = r14 instanceof androidx.compose.p004ui.text.font.C16176a0
            if (r15 != 0) goto L_0x0043
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        L_0x0043:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r15 = r13.f40218d
            androidx.compose.ui.text.font.o0 r2 = r13.f40215a
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r15 = r15.mo46793e(r14, r2, r0)
            if (r15 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r13
        L_0x0055:
            r15 = r14
            androidx.compose.ui.text.font.a0 r15 = (androidx.compose.p004ui.text.font.C16176a0) r15
            java.util.List r15 = r15.mo46822X()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r15.size()
            r1.<init>(r2)
            int r2 = r15.size()
            r3 = 0
        L_0x006a:
            if (r3 >= r2) goto L_0x00a5
            java.lang.Object r4 = r15.get(r3)
            androidx.compose.ui.text.font.t r4 = (androidx.compose.p004ui.text.font.C16238t) r4
            androidx.compose.ui.text.font.j1 r12 = new androidx.compose.ui.text.font.j1
            androidx.compose.ui.text.font.p0 r5 = r0.f40216b
            androidx.compose.ui.text.font.u r6 = r5.mo46993d(r14)
            androidx.compose.ui.text.font.p0 r5 = r0.f40216b
            androidx.compose.ui.text.font.i0 r7 = r4.getWeight()
            androidx.compose.ui.text.font.i0 r7 = r5.mo46885a(r7)
            androidx.compose.ui.text.font.p0 r5 = r0.f40216b
            int r4 = r4.mo46930b()
            int r8 = r5.mo46991b(r4)
            androidx.compose.ui.text.font.f0$a r4 = androidx.compose.p004ui.text.font.C16194f0.f40257b
            int r9 = r4.mo46895a()
            androidx.compose.ui.text.font.o0 r4 = r0.f40215a
            java.lang.Object r10 = r4.mo46755b()
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r3 = r3 + 1
            goto L_0x006a
        L_0x00a5:
            androidx.compose.ui.text.font.TypefaceRequestCache r14 = r0.f40217c
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r15 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r15.<init>(r0)
            r14.mo46808e(r1, r15)
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.FontFamilyResolverImpl.mo46783a(androidx.compose.ui.text.font.u, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: b */
    public C8578k2<Object> mo46784b(@C12580l C16242u uVar, @C12579k C16209i0 i0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        return mo46786i(new C16214j1(this.f40216b.mo46993d(uVar), this.f40216b.mo46885a(i0Var), this.f40216b.mo46991b(i), this.f40216b.mo46992c(i2), this.f40215a.mo46755b(), (DefaultConstructorMarker) null));
    }

    @C12579k
    /* renamed from: h */
    public final C16227o0 mo46785h() {
        return this.f40215a;
    }

    /* renamed from: i */
    public final C8578k2<Object> mo46786i(C16214j1 j1Var) {
        return this.f40217c.mo46809f(j1Var, new FontFamilyResolverImpl$resolve$result$1(this, j1Var));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontFamilyResolverImpl(C16227o0 o0Var, C16229p0 p0Var, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, C16225n0 n0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(o0Var, (i & 2) != 0 ? C16229p0.f40329a.mo46994a() : p0Var, (i & 4) != 0 ? C16248w.m73190b() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(C16248w.m73189a(), (CoroutineContext) null, 2, (DefaultConstructorMarker) null) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new C16225n0() : n0Var);
    }
}
