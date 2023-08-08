package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.common.reedsolomon.d */
public final class C34726d {

    /* renamed from: a */
    public final C34723a f84131a;

    /* renamed from: b */
    public final List<C34724b> f84132b;

    public C34726d(C34723a aVar) {
        this.f84131a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f84132b = arrayList;
        arrayList.add(new C34724b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    public final C34724b mo102739a(int i) {
        if (i >= this.f84132b.size()) {
            List<C34724b> list = this.f84132b;
            C34724b bVar = list.get(list.size() - 1);
            for (int size = this.f84132b.size(); size <= i; size++) {
                C34723a aVar = this.f84131a;
                bVar = bVar.mo102732i(new C34724b(aVar, new int[]{1, aVar.mo102715c((size - 1) + aVar.mo102716d())}));
                this.f84132b.add(bVar);
            }
        }
        return this.f84132b.get(i);
    }

    /* renamed from: b */
    public void mo102740b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C34724b a = mo102739a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e = new C34724b(this.f84131a, iArr2).mo102733j(i, 1).mo102725b(a)[1].mo102728e();
                int length2 = i - e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(e, 0, iArr, length + length2, e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
