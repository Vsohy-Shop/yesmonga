package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C10926c0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.e */
public final class C11327e extends C10926c0 {
    @C12579k

    /* renamed from: a */
    public final float[] f28443a;

    /* renamed from: b */
    public int f28444b;

    public C11327e(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "array");
        this.f28443a = fArr;
    }

    /* renamed from: c */
    public float mo22242c() {
        try {
            float[] fArr = this.f28443a;
            int i = this.f28444b;
            this.f28444b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28444b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.f28444b < this.f28443a.length;
    }
}
