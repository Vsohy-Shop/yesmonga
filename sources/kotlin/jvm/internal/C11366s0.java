package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.s0 */
public class C11366s0 {

    /* renamed from: a */
    public final ArrayList<Object> f28501a;

    public C11366s0(int i) {
        this.f28501a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo22855a(Object obj) {
        this.f28501a.add(obj);
    }

    /* renamed from: b */
    public void mo22856b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f28501a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f28501a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f28501a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f28501a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f28501a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int mo22857c() {
        return this.f28501a.size();
    }

    /* renamed from: d */
    public Object[] mo22858d(Object[] objArr) {
        return this.f28501a.toArray(objArr);
    }
}
