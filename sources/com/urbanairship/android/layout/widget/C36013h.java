package com.urbanairship.android.layout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import com.urbanairship.android.layout.property.ConstrainedSize;
import java.lang.ref.WeakReference;

/* renamed from: com.urbanairship.android.layout.widget.h */
public class C36013h {

    /* renamed from: a */
    public final WeakReference<View> f88997a;

    /* renamed from: b */
    public final ConstrainedSize f88998b;

    /* renamed from: com.urbanairship.android.layout.widget.h$a */
    public static /* synthetic */ class C36014a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88999a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.urbanairship.android.layout.property.ConstrainedSize$ConstrainedDimensionType[] r0 = com.urbanairship.android.layout.property.ConstrainedSize.ConstrainedDimensionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f88999a = r0
                com.urbanairship.android.layout.property.ConstrainedSize$ConstrainedDimensionType r1 = com.urbanairship.android.layout.property.ConstrainedSize.ConstrainedDimensionType.PERCENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f88999a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.property.ConstrainedSize$ConstrainedDimensionType r1 = com.urbanairship.android.layout.property.ConstrainedSize.ConstrainedDimensionType.ABSOLUTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.widget.C36013h.C36014a.<clinit>():void");
        }
    }

    @FunctionalInterface
    /* renamed from: com.urbanairship.android.layout.widget.h$b */
    public interface C36015b {
        /* renamed from: a */
        void mo107707a(@C0359n0 View view, int i, int i2);
    }

    @FunctionalInterface
    /* renamed from: com.urbanairship.android.layout.widget.h$c */
    public interface C36016c {
        /* renamed from: a */
        void mo107708a(int i, int i2);
    }

    public C36013h(@C0359n0 View view, @C0359n0 ConstrainedSize constrainedSize) {
        this.f88997a = new WeakReference<>(view);
        this.f88998b = constrainedSize;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo107709a(@androidx.annotation.C0363p0 com.urbanairship.android.layout.property.ConstrainedSize.C35812b r6, @androidx.annotation.C0363p0 com.urbanairship.android.layout.property.ConstrainedSize.C35812b r7, int r8, int r9) {
        /*
            r5 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r5.f88997a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x000b
            return r9
        L_0x000b:
            r1 = 2
            r2 = 1
            if (r6 == 0) goto L_0x003a
            int[] r3 = com.urbanairship.android.layout.widget.C36013h.C36014a.f88999a
            com.urbanairship.android.layout.property.ConstrainedSize$ConstrainedDimensionType r4 = r6.mo107254c()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r2) goto L_0x0030
            if (r3 == r1) goto L_0x0022
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0037
        L_0x0022:
            android.content.Context r3 = r0.getContext()
            int r6 = r6.mo107252b()
            float r6 = com.urbanairship.android.layout.util.C35921m.m148111a(r3, r6)
            int r6 = (int) r6
            goto L_0x0037
        L_0x0030:
            float r3 = (float) r8
            float r6 = r6.mo107251a()
            float r3 = r3 * r6
            int r6 = (int) r3
        L_0x0037:
            if (r9 >= r6) goto L_0x003a
            r9 = r6
        L_0x003a:
            if (r7 == 0) goto L_0x0067
            int[] r6 = com.urbanairship.android.layout.widget.C36013h.C36014a.f88999a
            com.urbanairship.android.layout.property.ConstrainedSize$ConstrainedDimensionType r3 = r7.mo107254c()
            int r3 = r3.ordinal()
            r6 = r6[r3]
            if (r6 == r2) goto L_0x005d
            if (r6 == r1) goto L_0x0050
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0064
        L_0x0050:
            android.content.Context r6 = r0.getContext()
            int r7 = r7.mo107252b()
            float r6 = com.urbanairship.android.layout.util.C35921m.m148111a(r6, r7)
            goto L_0x0063
        L_0x005d:
            float r6 = (float) r8
            float r7 = r7.mo107251a()
            float r6 = r6 * r7
        L_0x0063:
            int r6 = (int) r6
        L_0x0064:
            if (r9 <= r6) goto L_0x0067
            r9 = r6
        L_0x0067:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.widget.C36013h.mo107709a(com.urbanairship.android.layout.property.ConstrainedSize$b, com.urbanairship.android.layout.property.ConstrainedSize$b, int, int):int");
    }

    /* renamed from: b */
    public void mo107710b(int i, int i2, @C0359n0 C36015b bVar, @C0359n0 C36016c cVar) {
        boolean z;
        int i3;
        int i4;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        View view = this.f88997a.get();
        if (view != null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z2 = true;
            if (view.getLayoutParams().width == -2) {
                z = true;
            } else {
                z = false;
            }
            if (view.getLayoutParams().height != -2) {
                z2 = false;
            }
            if (!z) {
                i3 = size;
            } else {
                i3 = 0;
            }
            if (!z2) {
                i4 = size2;
            } else {
                i4 = 0;
            }
            if (z || z2) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                        View childAt = viewGroup.getChildAt(i5);
                        bVar.mo107707a(childAt, i, i2);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                        if (z) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                        }
                        if (z2) {
                            i4 = Math.max(i4, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                        }
                    }
                }
                int a = mo107709a(this.f88998b.mo107249h(), this.f88998b.mo107247f(), size, i3);
                int a2 = mo107709a(this.f88998b.mo107248g(), this.f88998b.mo107246e(), size2, i4);
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
            } else {
                makeMeasureSpec = i;
                makeMeasureSpec2 = i2;
            }
            cVar.mo107708a(makeMeasureSpec, makeMeasureSpec2);
        }
    }
}
