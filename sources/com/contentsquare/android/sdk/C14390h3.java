package com.contentsquare.android.sdk;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.h3 */
public class C14390h3 extends AbstractList<String> implements C14308ec, RandomAccess {

    /* renamed from: a */
    public final C14308ec f35587a;

    /* renamed from: com.contentsquare.android.sdk.h3$a */
    public class C14391a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f35588a;

        /* renamed from: b */
        public final /* synthetic */ int f35589b;

        public C14391a(int i) {
            this.f35589b = i;
            this.f35588a = C14390h3.this.f35587a.listIterator(i);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f35588a.next();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public String previous() {
            return this.f35588a.previous();
        }

        public boolean hasNext() {
            return this.f35588a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f35588a.hasPrevious();
        }

        public int nextIndex() {
            return this.f35588a.nextIndex();
        }

        public int previousIndex() {
            return this.f35588a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.h3$b */
    public class C14392b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f35591a;

        public C14392b() {
            this.f35591a = C14390h3.this.f35587a.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f35591a.next();
        }

        public boolean hasNext() {
            return this.f35591a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C14390h3(C14308ec ecVar) {
        this.f35587a = ecVar;
    }

    /* renamed from: E */
    public Object mo35077E(int i) {
        return this.f35587a.mo35077E(i);
    }

    /* renamed from: a */
    public C14308ec mo35078a() {
        return this;
    }

    /* renamed from: b */
    public List<?> mo35079b() {
        return this.f35587a.mo35079b();
    }

    /* renamed from: h */
    public String get(int i) {
        return (String) this.f35587a.get(i);
    }

    public Iterator<String> iterator() {
        return new C14392b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C14391a(i);
    }

    /* renamed from: q0 */
    public void mo35080q0(C14719t0 t0Var) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f35587a.size();
    }
}
