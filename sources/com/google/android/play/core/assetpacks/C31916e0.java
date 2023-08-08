package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32087s0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.google.android.play.core.assetpacks.e0 */
public final class C31916e0 extends C32087s0 {

    /* renamed from: a */
    public final File f77833a;

    /* renamed from: b */
    public final File f77834b;

    /* renamed from: c */
    public final NavigableMap<Long, File> f77835c = new TreeMap();

    public C31916e0(File file, File file2) throws IOException {
        this.f77833a = file;
        this.f77834b = file2;
        List<File> a = C31952l2.m129569a(file, file2);
        if (!a.isEmpty()) {
            long j = 0;
            for (File next : a) {
                this.f77835c.put(Long.valueOf(j), next);
                j += next.length();
            }
            return;
        }
        throw new C31904bk(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: a */
    public final long mo92549a() {
        Map.Entry<Long, File> lastEntry = this.f77835c.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* renamed from: b */
    public final InputStream mo92550b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C31904bk(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo92549a()) {
            Long floorKey = this.f77835c.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f77835c.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C31911d0(mo92552d(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo92552d(j, floorKey));
            Collection<File> values = this.f77835c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C31991u1(Collections.enumeration(values)));
            }
            arrayList.add(new C31911d0(new FileInputStream(this.f77835c.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C31904bk(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo92549a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }

    /* renamed from: d */
    public final InputStream mo92552d(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f77835c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C31904bk(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }
}
