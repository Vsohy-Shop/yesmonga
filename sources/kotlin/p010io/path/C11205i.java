package kotlin.p010io.path;

import com.fasterxml.jackson.databind.ext.C14969a;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.collections.C10944i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* renamed from: kotlin.io.path.i */
public final class C11205i extends SimpleFileVisitor<Path> {

    /* renamed from: a */
    public final boolean f28387a;
    @C12580l

    /* renamed from: b */
    public C11269y f28388b;
    @C12579k

    /* renamed from: c */
    public C10944i<C11269y> f28389c = new C10944i<>();

    public C11205i(boolean z) {
        this.f28387a = z;
    }

    /* renamed from: a */
    public final boolean mo22655a() {
        return this.f28387a;
    }

    @C12579k
    /* renamed from: b */
    public FileVisitResult mo22656b(@C12579k Path path, @C12579k BasicFileAttributes basicFileAttributes) {
        Intrinsics.checkNotNullParameter(path, "dir");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "attrs");
        this.f28389c.add(new C11269y(path, basicFileAttributes.fileKey(), this.f28388b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @C12579k
    /* renamed from: c */
    public final List<C11269y> mo22657c(@C12579k C11269y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "directoryNode");
        this.f28388b = yVar;
        Path unused = Files.walkFileTree(yVar.mo22688d(), C11265x.f28403a.mo22684b(this.f28387a), 1, C11197g.m43242a(this));
        this.f28389c.mo22306o0();
        C10944i<C11269y> iVar = this.f28389c;
        this.f28389c = new C10944i<>();
        return iVar;
    }

    @C12579k
    /* renamed from: d */
    public FileVisitResult mo22658d(@C12579k Path path, @C12579k BasicFileAttributes basicFileAttributes) {
        Intrinsics.checkNotNullParameter(path, "file");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "attrs");
        this.f28389c.add(new C11269y(path, (Object) null, this.f28388b));
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }

    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return mo22656b(C14969a.m64318a(obj), basicFileAttributes);
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return mo22658d(C14969a.m64318a(obj), basicFileAttributes);
    }
}
