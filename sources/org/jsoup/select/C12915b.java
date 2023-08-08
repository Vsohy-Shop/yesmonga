package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Element;

/* renamed from: org.jsoup.select.b */
public abstract class C12915b extends C12918c {

    /* renamed from: a */
    public final ArrayList<C12918c> f31940a;

    /* renamed from: b */
    public int f31941b;

    /* renamed from: org.jsoup.select.b$a */
    public static final class C12916a extends C12915b {
        public C12916a(Collection<C12918c> collection) {
            super(collection);
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            for (int i = this.f31941b - 1; i >= 0; i--) {
                if (!this.f31940a.get(i).mo30370a(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return C12759f.m55111k(this.f31940a, "");
        }

        public C12916a(C12918c... cVarArr) {
            this((Collection<C12918c>) Arrays.asList(cVarArr));
        }
    }

    public C12915b() {
        this.f31941b = 0;
        this.f31940a = new ArrayList<>();
    }

    /* renamed from: b */
    public void mo30367b(C12918c cVar) {
        this.f31940a.set(this.f31941b - 1, cVar);
    }

    @Nullable
    /* renamed from: c */
    public C12918c mo30368c() {
        int i = this.f31941b;
        if (i > 0) {
            return this.f31940a.get(i - 1);
        }
        return null;
    }

    /* renamed from: d */
    public void mo30369d() {
        this.f31941b = this.f31940a.size();
    }

    public C12915b(Collection<C12918c> collection) {
        this();
        this.f31940a.addAll(collection);
        mo30369d();
    }

    /* renamed from: org.jsoup.select.b$b */
    public static final class C12917b extends C12915b {
        public C12917b(Collection<C12918c> collection) {
            if (this.f31941b > 1) {
                this.f31940a.add(new C12916a(collection));
            } else {
                this.f31940a.addAll(collection);
            }
            mo30369d();
        }

        /* renamed from: a */
        public boolean mo30370a(Element element, Element element2) {
            for (int i = 0; i < this.f31941b; i++) {
                if (this.f31940a.get(i).mo30370a(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo30372e(C12918c cVar) {
            this.f31940a.add(cVar);
            mo30369d();
        }

        public String toString() {
            return C12759f.m55111k(this.f31940a, ", ");
        }

        public C12917b(C12918c... cVarArr) {
            this((Collection<C12918c>) Arrays.asList(cVarArr));
        }

        public C12917b() {
        }
    }
}
