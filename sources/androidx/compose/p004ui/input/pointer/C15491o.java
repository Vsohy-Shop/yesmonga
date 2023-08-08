package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n151#2,3:215\n33#2,4:218\n154#2,2:222\n38#2:224\n156#2:225\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n96#1:209,6\n99#1:215,3\n99#1:218,4\n99#1:222,2\n99#1:224\n99#1:225\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.o */
public final class C15491o {

    /* renamed from: f */
    public static final int f38521f = 8;
    @C12579k

    /* renamed from: a */
    public final List<C15507w> f38522a;
    @C12580l

    /* renamed from: b */
    public final C15476g f38523b;

    /* renamed from: c */
    public final int f38524c;

    /* renamed from: d */
    public final int f38525d;

    /* renamed from: e */
    public int f38526e;

    public C15491o(@C12579k List<C15507w> list, @C12580l C15476g gVar) {
        Intrinsics.checkNotNullParameter(list, "changes");
        this.f38522a = list;
        this.f38523b = gVar;
        MotionEvent h = mo44113h();
        int i = 0;
        this.f38524c = C15490n.m68665b(h != null ? h.getButtonState() : 0);
        MotionEvent h2 = mo44113h();
        this.f38525d = C15479h0.m68605b(h2 != null ? h2.getMetaState() : i);
        this.f38526e = mo44106a();
    }

    /* renamed from: a */
    public final int mo44106a() {
        MotionEvent h = mo44113h();
        if (h != null) {
            int actionMasked = h.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return C15493q.f38527b.mo44125f();
                            case 9:
                                return C15493q.f38527b.mo44120a();
                            case 10:
                                return C15493q.f38527b.mo44121b();
                            default:
                                return C15493q.f38527b.mo44126g();
                        }
                    }
                    return C15493q.f38527b.mo44122c();
                }
                return C15493q.f38527b.mo44124e();
            }
            return C15493q.f38527b.mo44123d();
        }
        List<C15507w> list = this.f38522a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C15507w wVar = list.get(i);
            if (C15492p.m68685e(wVar)) {
                return C15493q.f38527b.mo44124e();
            }
            if (C15492p.m68683c(wVar)) {
                return C15493q.f38527b.mo44123d();
            }
        }
        return C15493q.f38527b.mo44122c();
    }

    @C12579k
    /* renamed from: b */
    public final List<C15507w> mo44107b() {
        return this.f38522a;
    }

    @C12579k
    /* renamed from: c */
    public final C15491o mo44108c(@C12579k List<C15507w> list, @C12580l MotionEvent motionEvent) {
        boolean z;
        List<C15507w> list2 = list;
        MotionEvent motionEvent2 = motionEvent;
        Intrinsics.checkNotNullParameter(list2, "changes");
        if (motionEvent2 == null) {
            return new C15491o(list2, (C15476g) null);
        }
        if (Intrinsics.areEqual((Object) motionEvent2, (Object) mo44113h())) {
            return new C15491o(list2, this.f38523b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C15507w wVar = list2.get(i);
            linkedHashMap.put(C15506v.m68786a(wVar.mo44176p()), wVar);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i2 = 0;
        while (i2 < size2) {
            C15507w wVar2 = list2.get(i2);
            long p = wVar2.mo44176p();
            long z2 = wVar2.mo44186z();
            long q = wVar2.mo44177q();
            long q2 = wVar2.mo44177q();
            boolean r = wVar2.mo44178r();
            float s = wVar2.mo44179s();
            int y = wVar2.mo44185y();
            C15476g gVar = this.f38523b;
            int i3 = size2;
            if (gVar != null) {
                z = true;
                if (gVar.mo44053e(wVar2.mo44176p())) {
                    C15511z zVar = r9;
                    C15511z zVar2 = new C15511z(p, z2, q, q2, r, s, y, z, (List) null, 0, 768, (DefaultConstructorMarker) null);
                    arrayList.add(zVar);
                    i2++;
                    size2 = i3;
                }
            }
            z = false;
            C15511z zVar3 = zVar2;
            C15511z zVar22 = new C15511z(p, z2, q, q2, r, s, y, z, (List) null, 0, 768, (DefaultConstructorMarker) null);
            arrayList.add(zVar3);
            i2++;
            size2 = i3;
        }
        return new C15491o(list2, new C15476g(linkedHashMap, new C15510y(motionEvent.getEventTime(), arrayList, motionEvent2)));
    }

    /* renamed from: d */
    public final int mo44109d() {
        return this.f38524c;
    }

    @C12579k
    /* renamed from: e */
    public final List<C15507w> mo44110e() {
        return this.f38522a;
    }

    @C12580l
    /* renamed from: f */
    public final C15476g mo44111f() {
        return this.f38523b;
    }

    /* renamed from: g */
    public final int mo44112g() {
        return this.f38525d;
    }

    @C12580l
    /* renamed from: h */
    public final MotionEvent mo44113h() {
        C15476g gVar = this.f38523b;
        if (gVar != null) {
            return gVar.mo44050b();
        }
        return null;
    }

    /* renamed from: i */
    public final int mo44114i() {
        return this.f38526e;
    }

    /* renamed from: j */
    public final void mo44115j(int i) {
        this.f38526e = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15491o(@C12579k List<C15507w> list) {
        this(list, (C15476g) null);
        Intrinsics.checkNotNullParameter(list, "changes");
    }
}
