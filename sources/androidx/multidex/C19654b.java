package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.multidex.b */
public final class C19654b {

    /* renamed from: a */
    public static final String f50302a = "MultiDex";

    /* renamed from: b */
    public static final String f50303b = "secondary-dexes";

    /* renamed from: c */
    public static final String f50304c = "code_cache";

    /* renamed from: d */
    public static final String f50305d = "secondary-dexes";

    /* renamed from: e */
    public static final int f50306e = 20;

    /* renamed from: f */
    public static final int f50307f = 4;

    /* renamed from: g */
    public static final int f50308g = 2;

    /* renamed from: h */
    public static final int f50309h = 1;

    /* renamed from: i */
    public static final String f50310i = "";

    /* renamed from: j */
    public static final Set<File> f50311j = new HashSet();

    /* renamed from: k */
    public static final boolean f50312k = m91305n(System.getProperty("java.vm.version"));

    /* renamed from: androidx.multidex.b$a */
    public static final class C19655a {

        /* renamed from: b */
        public static final int f50313b = 4;

        /* renamed from: a */
        public final C19656a f50314a;

        /* renamed from: androidx.multidex.b$a$a */
        public interface C19656a {
            /* renamed from: a */
            Object mo58030a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: androidx.multidex.b$a$b */
        public static class C19657b implements C19656a {

            /* renamed from: a */
            public final Constructor<?> f50315a;

            public C19657b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f50315a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo58030a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.f50315a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: androidx.multidex.b$a$c */
        public static class C19658c implements C19656a {

            /* renamed from: a */
            public final Constructor<?> f50316a;

            public C19658c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Class<File> cls2 = File.class;
                Constructor<?> constructor = cls.getConstructor(new Class[]{cls2, cls2, DexFile.class});
                this.f50316a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo58030a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f50316a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: androidx.multidex.b$a$d */
        public static class C19659d implements C19656a {

            /* renamed from: a */
            public final Constructor<?> f50317a;

            public C19659d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Class<File> cls2 = File.class;
                Constructor<?> constructor = cls.getConstructor(new Class[]{cls2, Boolean.TYPE, cls2, DexFile.class});
                this.f50317a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo58030a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f50317a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C19655a() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                androidx.multidex.b$a$b r1 = new androidx.multidex.b$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                androidx.multidex.b$a$c r1 = new androidx.multidex.b$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                androidx.multidex.b$a$d r1 = new androidx.multidex.b$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f50314a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.C19654b.C19655a.<init>():void");
        }

        /* renamed from: a */
        public static void m91307a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = C19654b.m91298g(classLoader, "pathList").get(classLoader);
            Object[] b = new C19655a().mo58029b(list);
            try {
                C19654b.m91297f(obj, "dexElements", b);
            } catch (NoSuchFieldException unused) {
                C19654b.m91297f(obj, "pathElements", b);
            }
        }

        /* renamed from: c */
        public static String m91308c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f50313b) + MultiDexExtractor.f50285w).getPath();
        }

        /* renamed from: b */
        public final Object[] mo58029b(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f50314a.mo58030a(file, DexFile.loadDex(file.getPath(), m91308c(file), 0));
            }
            return objArr;
        }
    }

    /* renamed from: androidx.multidex.b$b */
    public static final class C19660b {
        /* renamed from: a */
        public static void m91314a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = C19654b.m91298g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C19654b.m91297f(obj, "dexElements", m91315b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field a = C19654b.m91298g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        /* renamed from: b */
        public static Object[] m91315b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            Class<ArrayList> cls = ArrayList.class;
            return (Object[]) C19654b.m91299h(obj, "makeDexElements", cls, File.class, cls).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: androidx.multidex.b$c */
    public static final class C19661c {
        /* renamed from: a */
        public static void m91316a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field a = C19654b.m91298g(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(C12361b.f30257h);
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + MultiDexExtractor.f50285w, 0);
            }
            a.set(classLoader, sb.toString());
            C19654b.m91297f(classLoader, "mPaths", strArr);
            C19654b.m91297f(classLoader, "mFiles", fileArr);
            C19654b.m91297f(classLoader, "mZips", zipFileArr);
            C19654b.m91297f(classLoader, "mDexs", dexFileArr);
        }
    }

    /* renamed from: d */
    public static void m91295d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                if (!file2.delete()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to delete old file ");
                    sb4.append(file2.getPath());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Deleted old file ");
                    sb5.append(file2.getPath());
                }
            }
            if (!file.delete()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Deleted old secondary dex dir ");
            sb7.append(file.getPath());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074 A[SYNTHETIC, Splitter:B:33:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076 A[Catch:{ RuntimeException -> 0x007d }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m91296e(android.content.Context r4, java.io.File r5, java.io.File r6, java.lang.String r7, java.lang.String r8, boolean r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = f50311j
            monitor-enter(r0)
            boolean r1 = r0.contains(r5)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x000b:
            r0.add(r5)     // Catch:{ all -> 0x007f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r2.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "MultiDex is not guaranteed to work in SDK version "
            r2.append(r3)     // Catch:{ all -> 0x007f }
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = ": SDK version higher than "
            r2.append(r1)     // Catch:{ all -> 0x007f }
            r1 = 20
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = " should be backed by "
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "case here: java.vm.version=\""
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x007f }
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "\""
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch:{ RuntimeException -> 0x007d }
            if (r1 != 0) goto L_0x004c
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x004c:
            m91295d(r4)     // Catch:{ all -> 0x004f }
        L_0x004f:
            java.io.File r6 = m91301j(r4, r6, r7)     // Catch:{ all -> 0x007f }
            androidx.multidex.MultiDexExtractor r7 = new androidx.multidex.MultiDexExtractor     // Catch:{ all -> 0x007f }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x007f }
            r5 = 0
            java.util.List r5 = r7.mo58025j(r4, r8, r5)     // Catch:{ all -> 0x0078 }
            m91304m(r1, r6, r5)     // Catch:{ IOException -> 0x0061 }
            goto L_0x006c
        L_0x0061:
            r5 = move-exception
            if (r9 == 0) goto L_0x0077
            r5 = 1
            java.util.List r4 = r7.mo58025j(r4, r8, r5)     // Catch:{ all -> 0x0078 }
            m91304m(r1, r6, r4)     // Catch:{ all -> 0x0078 }
        L_0x006c:
            r7.close()     // Catch:{ IOException -> 0x0071 }
            r4 = 0
            goto L_0x0072
        L_0x0071:
            r4 = move-exception
        L_0x0072:
            if (r4 != 0) goto L_0x0076
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x0076:
            throw r4     // Catch:{ all -> 0x007f }
        L_0x0077:
            throw r5     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r4 = move-exception
            r7.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            throw r4     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x007f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.C19654b.m91296e(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: f */
    public static void m91297f(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field g = m91298g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    /* renamed from: g */
    public static Field m91298g(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* renamed from: h */
    public static Method m91299h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: i */
    public static ApplicationInfo m91300i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static File m91301j(Context context, File file, String str) throws IOException {
        File file2 = new File(file, f50304c);
        try {
            m91306o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), f50304c);
            m91306o(file2);
        }
        File file3 = new File(file2, str);
        m91306o(file3);
        return file3;
    }

    /* renamed from: k */
    public static void m91302k(Context context) {
        if (!f50312k) {
            try {
                ApplicationInfo i = m91300i(context);
                if (i != null) {
                    m91296e(context, new File(i.sourceDir), new File(i.dataDir), "secondary-dexes", "", true);
                }
            } catch (Exception e) {
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        }
    }

    /* renamed from: l */
    public static void m91303l(Context context, Context context2) {
        ApplicationInfo i;
        if (!f50312k) {
            try {
                ApplicationInfo i2 = m91300i(context);
                if (i2 != null && (i = m91300i(context2)) != null) {
                    String str = context.getPackageName() + ".";
                    File file = new File(i.dataDir);
                    m91296e(context2, new File(i2.sourceDir), file, str + "secondary-dexes", str, false);
                    m91296e(context2, new File(i.sourceDir), file, "secondary-dexes", "", false);
                }
            } catch (Exception e) {
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        }
    }

    /* renamed from: m */
    public static void m91304m(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            C19660b.m91314a(classLoader, list, file);
        }
    }

    /* renamed from: n */
    public static boolean m91305n(String str) {
        String str2;
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        if (z) {
            str2 = " has multidex support";
        } else {
            str2 = " does not have multidex support";
        }
        sb.append(str2);
        return z;
    }

    /* renamed from: o */
    public static void m91306o(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
