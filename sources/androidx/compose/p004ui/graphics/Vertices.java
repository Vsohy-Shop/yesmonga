package androidx.compose.p004ui.graphics;

import androidx.compose.p004ui.geometry.C15094f;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n101#2,2:76\n33#2,6:78\n103#2:84\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:76,2\n42#1:78,6\n42#1:84\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.Vertices */
public final class Vertices {

    /* renamed from: a */
    public final int f37321a;
    @C12579k

    /* renamed from: b */
    public final float[] f37322b;
    @C12579k

    /* renamed from: c */
    public final float[] f37323c;
    @C12579k

    /* renamed from: d */
    public final int[] f37324d;
    @C12579k

    /* renamed from: e */
    public final short[] f37325e;

    public /* synthetic */ Vertices(int i, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, list4);
    }

    /* renamed from: a */
    public final int[] mo42404a(List<C15240j2> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = C15258l2.m66193r(list.get(i).mo42833M());
        }
        return iArr;
    }

    /* renamed from: b */
    public final float[] mo42405b(List<C15094f> list) {
        float f;
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long A = list.get(i / 2).mo42242A();
            if (i % 2 == 0) {
                f = C15094f.m64880p(A);
            } else {
                f = C15094f.m64882r(A);
            }
            fArr[i] = f;
        }
        return fArr;
    }

    @C12579k
    /* renamed from: c */
    public final int[] mo42406c() {
        return this.f37324d;
    }

    @C12579k
    /* renamed from: d */
    public final short[] mo42407d() {
        return this.f37325e;
    }

    @C12579k
    /* renamed from: e */
    public final float[] mo42408e() {
        return this.f37322b;
    }

    @C12579k
    /* renamed from: f */
    public final float[] mo42409f() {
        return this.f37323c;
    }

    /* renamed from: g */
    public final int mo42410g() {
        return this.f37321a;
    }

    public Vertices(int i, List<C15094f> list, List<C15094f> list2, List<C15240j2> list3, List<Integer> list4) {
        boolean z;
        this.f37321a = i;
        Vertices$outOfBounds$1 vertices$outOfBounds$1 = new Vertices$outOfBounds$1(list);
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        } else if (list3.size() == list.size()) {
            int size = list4.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                } else if (((Boolean) vertices$outOfBounds$1.invoke(list4.get(i2))).booleanValue()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                this.f37322b = mo42405b(list);
                this.f37323c = mo42405b(list2);
                this.f37324d = mo42404a(list3);
                int size2 = list4.size();
                short[] sArr = new short[size2];
                for (int i3 = 0; i3 < size2; i3++) {
                    sArr[i3] = (short) list4.get(i3).intValue();
                }
                this.f37325e = sArr;
                return;
            }
            throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
        } else {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
    }
}
