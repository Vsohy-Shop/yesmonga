package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C20099a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.x */
public class C20222x {

    /* renamed from: a */
    public final C20223a f52205a;

    /* renamed from: androidx.recyclerview.widget.x$a */
    public interface C20223a {
        /* renamed from: a */
        C20099a.C20101b mo60197a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo60198b(C20099a.C20101b bVar);
    }

    public C20222x(C20223a aVar) {
        this.f52205a = aVar;
    }

    /* renamed from: a */
    public final int mo60689a(List<C20099a.C20101b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f51701a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo60690b(List<C20099a.C20101b> list) {
        while (true) {
            int a = mo60689a(list);
            if (a != -1) {
                mo60692d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo60691c(List<C20099a.C20101b> list, int i, C20099a.C20101b bVar, int i2, C20099a.C20101b bVar2) {
        int i3;
        int i4 = bVar.f51704d;
        int i5 = bVar2.f51702b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = bVar.f51702b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            bVar.f51702b = i6 + bVar2.f51704d;
        }
        int i7 = bVar2.f51702b;
        if (i7 <= i4) {
            bVar.f51704d = i4 + bVar2.f51704d;
        }
        bVar2.f51702b = i7 + i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    public final void mo60692d(List<C20099a.C20101b> list, int i, int i2) {
        C20099a.C20101b bVar = list.get(i);
        C20099a.C20101b bVar2 = list.get(i2);
        int i3 = bVar2.f51701a;
        if (i3 == 1) {
            mo60691c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo60693e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo60694f(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: e */
    public void mo60693e(List<C20099a.C20101b> list, int i, C20099a.C20101b bVar, int i2, C20099a.C20101b bVar2) {
        boolean z;
        int i3 = bVar.f51702b;
        int i4 = bVar.f51704d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.f51702b == i3 && bVar2.f51704d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f51702b == i4 + 1 && bVar2.f51704d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.f51702b;
        if (i4 < i5) {
            bVar2.f51702b = i5 - 1;
        } else {
            int i6 = bVar2.f51704d;
            if (i4 < i5 + i6) {
                bVar2.f51704d = i6 - 1;
                bVar.f51701a = 2;
                bVar.f51704d = 1;
                if (bVar2.f51704d == 0) {
                    list.remove(i2);
                    this.f52205a.mo60198b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.f51702b;
        int i8 = bVar2.f51702b;
        C20099a.C20101b bVar3 = null;
        if (i7 <= i8) {
            bVar2.f51702b = i8 + 1;
        } else {
            int i9 = bVar2.f51704d;
            if (i7 < i8 + i9) {
                bVar3 = this.f52205a.mo60197a(2, i7 + 1, (i8 + i9) - i7, (Object) null);
                bVar2.f51704d = bVar.f51702b - bVar2.f51702b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f52205a.mo60198b(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                int i10 = bVar.f51702b;
                if (i10 > bVar3.f51702b) {
                    bVar.f51702b = i10 - bVar3.f51704d;
                }
                int i11 = bVar.f51704d;
                if (i11 > bVar3.f51702b) {
                    bVar.f51704d = i11 - bVar3.f51704d;
                }
            }
            int i12 = bVar.f51702b;
            if (i12 > bVar2.f51702b) {
                bVar.f51702b = i12 - bVar2.f51704d;
            }
            int i13 = bVar.f51704d;
            if (i13 > bVar2.f51702b) {
                bVar.f51704d = i13 - bVar2.f51704d;
            }
        } else {
            if (bVar3 != null) {
                int i14 = bVar.f51702b;
                if (i14 >= bVar3.f51702b) {
                    bVar.f51702b = i14 - bVar3.f51704d;
                }
                int i15 = bVar.f51704d;
                if (i15 >= bVar3.f51702b) {
                    bVar.f51704d = i15 - bVar3.f51704d;
                }
            }
            int i16 = bVar.f51702b;
            if (i16 >= bVar2.f51702b) {
                bVar.f51702b = i16 - bVar2.f51704d;
            }
            int i17 = bVar.f51704d;
            if (i17 >= bVar2.f51702b) {
                bVar.f51704d = i17 - bVar2.f51704d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f51702b != bVar.f51704d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60694f(java.util.List<androidx.recyclerview.widget.C20099a.C20101b> r9, int r10, androidx.recyclerview.widget.C20099a.C20101b r11, int r12, androidx.recyclerview.widget.C20099a.C20101b r13) {
        /*
            r8 = this;
            int r0 = r11.f51704d
            int r1 = r13.f51702b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r3
            r13.f51702b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f51704d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r3
            r13.f51704d = r5
            androidx.recyclerview.widget.x$a r0 = r8.f52205a
            int r1 = r11.f51702b
            java.lang.Object r5 = r13.f51703c
            androidx.recyclerview.widget.a$b r0 = r0.mo60197a(r2, r1, r3, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r4
        L_0x0021:
            int r1 = r11.f51702b
            int r5 = r13.f51702b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r3
            r13.f51702b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f51704d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.x$a r4 = r8.f52205a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f51703c
            androidx.recyclerview.widget.a$b r4 = r4.mo60197a(r2, r1, r5, r3)
            int r1 = r13.f51704d
            int r1 = r1 - r5
            r13.f51704d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f51704d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.x$a r11 = r8.f52205a
            r11.mo60198b(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r9.add(r10, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C20222x.mo60694f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
