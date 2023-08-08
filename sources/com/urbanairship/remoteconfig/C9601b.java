package com.urbanairship.remoteconfig;

import android.util.SparseArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36040b;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.urbanairship.remoteconfig.b */
public class C9601b {

    /* renamed from: a */
    public SparseArray<Set<C36040b>> f26261a = null;

    @C0359n0
    /* renamed from: a */
    public static SparseArray<Set<C36040b>> m35966a(@C0359n0 Collection<C36040b> collection) {
        SparseArray<Set<C36040b>> sparseArray = new SparseArray<>();
        for (C36040b next : collection) {
            Set set = sparseArray.get(next.mo17620n());
            if (set == null) {
                set = new HashSet();
                sparseArray.put(next.mo17620n(), set);
            }
            set.add(next);
        }
        return sparseArray;
    }

    @C0359n0
    /* renamed from: b */
    public final Collection<? extends C36040b> mo19519b(@C0359n0 String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1693017210:
                if (str.equals("analytics")) {
                    c = 0;
                    break;
                }
                break;
            case -1071151692:
                if (str.equals(C9602c.f26265d)) {
                    c = 1;
                    break;
                }
                break;
            case -280467183:
                if (str.equals("named_user")) {
                    c = 2;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c = 3;
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 4;
                    break;
                }
                break;
            case 238809145:
                if (str.equals(C9602c.f26272k)) {
                    c = 5;
                    break;
                }
                break;
            case 344200471:
                if (str.equals(C9602c.f26266e)) {
                    c = 6;
                    break;
                }
                break;
            case 536871821:
                if (str.equals("message_center")) {
                    c = 7;
                    break;
                }
                break;
            case 738950403:
                if (str.equals("channel")) {
                    c = 8;
                    break;
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    c = 9;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo19520c(1);
            case 1:
                return mo19520c(3);
            case 2:
                return mo19520c(5);
            case 3:
                return mo19520c(8);
            case 4:
                return mo19520c(0);
            case 5:
                return mo19520c(10);
            case 6:
                return mo19520c(4);
            case 7:
                return mo19520c(2);
            case 8:
                return mo19520c(7);
            case 9:
                return mo19520c(9);
            case 10:
                return mo19520c(6);
            default:
                C36059m.m148419o("Unable to find module: %s", str);
                return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: c */
    public final Set<C36040b> mo19520c(int i) {
        if (this.f26261a == null) {
            this.f26261a = m35966a(UAirship.m146188Y().mo106226q());
        }
        return this.f26261a.get(i, Collections.emptySet());
    }

    /* renamed from: d */
    public void mo19521d(@C0359n0 String str, @C0363p0 C9323b bVar) {
        for (C36040b bVar2 : mo19519b(str)) {
            if (bVar2.mo107787s()) {
                bVar2.mo107788w(bVar);
            }
        }
    }

    /* renamed from: e */
    public void mo19522e(@C0359n0 String str, boolean z) {
        for (C36040b z2 : mo19519b(str)) {
            z2.mo107789z(z);
        }
    }
}
