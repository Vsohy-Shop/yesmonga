package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16217k1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11043a;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12044k0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,427:1\n35#2,3:428\n38#2,2:435\n40#2:438\n56#2,4:450\n60#2,3:458\n63#2:462\n33#3,4:431\n38#3:437\n151#3,3:439\n33#3,4:442\n154#3,2:446\n38#3:448\n156#3:449\n33#3,4:454\n38#3:461\n33#3,6:463\n49#4,4:469\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n68#1:428,3\n68#1:435,2\n68#1:438\n70#1:450,4\n70#1:458,3\n70#1:462\n68#1:431,4\n68#1:437\n69#1:439,3\n69#1:442,4\n69#1:446,2\n69#1:448\n69#1:449\n70#1:454,4\n70#1:461\n74#1:463,6\n155#1:469,4\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter */
public final class FontListFontFamilyTypefaceAdapter implements C16252y {
    @C12579k

    /* renamed from: c */
    public static final C16171a f40223c = new C16171a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final C16187d0 f40224d = new C16187d0();
    @C12579k

    /* renamed from: e */
    public static final C12044k0 f40225e = new C16172b(C12044k0.f29686v0);
    @C12579k

    /* renamed from: a */
    public final AsyncTypefaceCache f40226a;
    @C12579k

    /* renamed from: b */
    public C12074o0 f40227b;

    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$a */
    public static final class C16171a {
        public /* synthetic */ C16171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C12044k0 mo46794a() {
            return FontListFontFamilyTypefaceAdapter.f40225e;
        }

        @C12579k
        /* renamed from: b */
        public final C16187d0 mo46795b() {
            return FontListFontFamilyTypefaceAdapter.f40224d;
        }

        public C16171a() {
        }
    }

    @C11363r0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n1#1,110:1\n156#2:111\n*E\n"})
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$b */
    public static final class C16172b extends C11043a implements C12044k0 {
        public C16172b(C12044k0.C12046b bVar) {
            super(bVar);
        }

        /* renamed from: P */
        public void mo23719P(@C12579k CoroutineContext coroutineContext, @C12579k Throwable th) {
        }
    }

    public FontListFontFamilyTypefaceAdapter() {
        this((AsyncTypefaceCache) null, (CoroutineContext) null, 3, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public C16217k1 mo46792a(@C12579k C16214j1 j1Var, @C12579k C16227o0 o0Var, @C12579k C11300l<? super C16217k1.C16219b, C11079d2> lVar, @C12579k C11300l<? super C16214j1, ? extends Object> lVar2) {
        C16214j1 j1Var2 = j1Var;
        C16227o0 o0Var2 = o0Var;
        C11300l<? super C16214j1, ? extends Object> lVar3 = lVar2;
        Intrinsics.checkNotNullParameter(j1Var2, "typefaceRequest");
        Intrinsics.checkNotNullParameter(o0Var2, "platformFontLoader");
        Intrinsics.checkNotNullParameter(lVar, "onAsyncCompletion");
        Intrinsics.checkNotNullParameter(lVar3, "createDefaultTypeface");
        if (!(j1Var.mo46968h() instanceof C16176a0)) {
            return null;
        }
        Pair a = C16179b0.m72908b(f40224d.mo46876e(((C16176a0) j1Var.mo46968h()).mo46822X(), j1Var.mo46972k(), j1Var.mo46970i()), j1Var2, this.f40226a, o0Var2, lVar3);
        List list = (List) a.mo21846a();
        Object b = a.mo21847b();
        if (list == null) {
            return new C16217k1.C16219b(b, false, 2, (DefaultConstructorMarker) null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b, j1Var, this.f40226a, lVar, o0Var);
        C11723c2 unused = C12038j.m48061f(this.f40227b, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, (C11045c<? super FontListFontFamilyTypefaceAdapter$resolve$1>) null), 1, (Object) null);
        return new C16217k1.C16218a(asyncFontListLoader);
    }

    @C12580l
    /* renamed from: e */
    public final Object mo46793e(@C12579k C16242u uVar, @C12579k C16227o0 o0Var, @C12579k C11045c<? super C11079d2> cVar) {
        C16242u uVar2 = uVar;
        C16227o0 o0Var2 = o0Var;
        if (!(uVar2 instanceof C16176a0)) {
            return C11079d2.f28267a;
        }
        C16176a0 a0Var = (C16176a0) uVar2;
        List<C16238t> X = a0Var.mo46822X();
        List<C16238t> X2 = a0Var.mo46822X();
        ArrayList arrayList = new ArrayList(X2.size());
        int size = X2.size();
        for (int i = 0; i < size; i++) {
            C16238t tVar = X2.get(i);
            if (C16182c0.m72919g(tVar.mo46868a(), C16182c0.f40243b.mo46865a())) {
                arrayList.add(tVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C16238t tVar2 = (C16238t) arrayList.get(i2);
            arrayList2.add(C11078d1.m42659a(tVar2.getWeight(), C16190e0.m72948c(tVar2.mo46930b())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj = arrayList2.get(i3);
            if (hashSet.add((Pair) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i4 = 0;
        while (i4 < size4) {
            Pair pair = (Pair) arrayList3.get(i4);
            C16209i0 i0Var = (C16209i0) pair.mo21846a();
            int j = ((C16190e0) pair.mo21847b()).mo46880j();
            List<C16238t> e = f40224d.mo46876e(X, i0Var, j);
            C16214j1 j1Var = r1;
            C16214j1 j1Var2 = new C16214j1(uVar, i0Var, j, C16194f0.f40257b.mo46895a(), o0Var.mo46755b(), (DefaultConstructorMarker) null);
            List list = (List) C16179b0.m72908b(e, j1Var, this.f40226a, o0Var2, FontListFontFamilyTypefaceAdapter$preload$2$1.f40228f).mo21846a();
            if (list != null) {
                arrayList4.add(CollectionsKt___CollectionsKt.m40706w2(list));
            }
            i4++;
            C16242u uVar3 = uVar;
        }
        Object g = C12079p0.m48266g(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList4, this, o0Var2, (C11045c<? super FontListFontFamilyTypefaceAdapter$preload$3>) null), cVar);
        if (g == C11063b.m42612h()) {
            return g;
        }
        return C11079d2.f28267a;
    }

    public FontListFontFamilyTypefaceAdapter(@C12579k AsyncTypefaceCache asyncTypefaceCache, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(coroutineContext, "injectedContext");
        this.f40226a = asyncTypefaceCache;
        this.f40227b = C12079p0.m48260a(f40225e.mo7443Q(coroutineContext).mo7443Q(C11719b3.m46153a((C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0))));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? EmptyCoroutineContext.f28243a : coroutineContext);
    }
}
