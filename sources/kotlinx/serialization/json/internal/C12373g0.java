package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.C11300l;

/* renamed from: kotlinx.serialization.json.internal.g0 */
public final class C12373g0 {
    /* renamed from: a */
    public static final <T> T m50036a(C12359a aVar, String str, C11300l<? super String, ? extends T> lVar) {
        String r = aVar.mo25449r();
        try {
            return lVar.invoke(r);
        } catch (IllegalArgumentException unused) {
            C12359a.m49866x(aVar, "Failed to parse type '" + str + "' for input '" + r + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }
}
