package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.k1 */
public class C18784k1 extends C18797l1 {

    /* renamed from: f */
    public final C18920z1 f47900f;

    /* renamed from: androidx.datastore.preferences.protobuf.k1$b */
    public static class C18786b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C18784k1> f47901a;

        /* renamed from: a */
        public C18784k1 mo54914a() {
            return this.f47901a.getValue();
        }

        public K getKey() {
            return this.f47901a.getKey();
        }

        public Object getValue() {
            C18784k1 value = this.f47901a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo54912p();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C18920z1) {
                return this.f47901a.getValue().mo54932m((C18920z1) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C18786b(Map.Entry<K, C18784k1> entry) {
            this.f47901a = entry;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k1$c */
    public static class C18787c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f47902a;

        public C18787c(Iterator<Map.Entry<K, Object>> it) {
            this.f47902a = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f47902a.next();
            if (next.getValue() instanceof C18784k1) {
                return new C18786b(next);
            }
            return next;
        }

        public boolean hasNext() {
            return this.f47902a.hasNext();
        }

        public void remove() {
            this.f47902a.remove();
        }
    }

    public C18784k1(C18920z1 z1Var, C18836p0 p0Var, ByteString byteString) {
        super(p0Var, byteString);
        this.f47900f = z1Var;
    }

    /* renamed from: c */
    public boolean mo54909c() {
        return super.mo54909c() || this.f47913c == this.f47900f;
    }

    public boolean equals(Object obj) {
        return mo54912p().equals(obj);
    }

    public int hashCode() {
        return mo54912p().hashCode();
    }

    /* renamed from: p */
    public C18920z1 mo54912p() {
        return mo54927g(this.f47900f);
    }

    public String toString() {
        return mo54912p().toString();
    }
}
