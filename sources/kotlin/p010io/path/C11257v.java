package kotlin.p010io.path;

import com.fasterxml.jackson.databind.ext.C14969a;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.io.path.v */
public final class C11257v extends SimpleFileVisitor<Path> {
    @C12580l

    /* renamed from: a */
    public final C11304p<Path, BasicFileAttributes, FileVisitResult> f28399a;
    @C12580l

    /* renamed from: b */
    public final C11304p<Path, BasicFileAttributes, FileVisitResult> f28400b;
    @C12580l

    /* renamed from: c */
    public final C11304p<Path, IOException, FileVisitResult> f28401c;
    @C12580l

    /* renamed from: d */
    public final C11304p<Path, IOException, FileVisitResult> f28402d;

    public C11257v(@C12580l C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @C12580l C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @C12580l C11304p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @C12580l C11304p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f28399a = pVar;
        this.f28400b = pVar2;
        this.f28401c = pVar3;
        this.f28402d = pVar4;
    }

    @C12579k
    /* renamed from: a */
    public FileVisitResult mo22675a(@C12579k Path path, @C12580l IOException iOException) {
        FileVisitResult a;
        Intrinsics.checkNotNullParameter(path, "dir");
        C11304p<Path, IOException, FileVisitResult> pVar = this.f28402d;
        if (pVar != null && (a = C11253u.m43317a(pVar.invoke(path, iOException))) != null) {
            return a;
        }
        FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
        Intrinsics.checkNotNullExpressionValue(postVisitDirectory, "super.postVisitDirectory(dir, exc)");
        return postVisitDirectory;
    }

    @C12579k
    /* renamed from: b */
    public FileVisitResult mo22676b(@C12579k Path path, @C12579k BasicFileAttributes basicFileAttributes) {
        FileVisitResult a;
        Intrinsics.checkNotNullParameter(path, "dir");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "attrs");
        C11304p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f28399a;
        if (pVar != null && (a = C11253u.m43317a(pVar.invoke(path, basicFileAttributes))) != null) {
            return a;
        }
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @C12579k
    /* renamed from: c */
    public FileVisitResult mo22677c(@C12579k Path path, @C12579k BasicFileAttributes basicFileAttributes) {
        FileVisitResult a;
        Intrinsics.checkNotNullParameter(path, "file");
        Intrinsics.checkNotNullParameter(basicFileAttributes, "attrs");
        C11304p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f28400b;
        if (pVar != null && (a = C11253u.m43317a(pVar.invoke(path, basicFileAttributes))) != null) {
            return a;
        }
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        Intrinsics.checkNotNullExpressionValue(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }

    @C12579k
    /* renamed from: d */
    public FileVisitResult mo22678d(@C12579k Path path, @C12579k IOException iOException) {
        FileVisitResult a;
        Intrinsics.checkNotNullParameter(path, "file");
        Intrinsics.checkNotNullParameter(iOException, "exc");
        C11304p<Path, IOException, FileVisitResult> pVar = this.f28401c;
        if (pVar != null && (a = C11253u.m43317a(pVar.invoke(path, iOException))) != null) {
            return a;
        }
        FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
        Intrinsics.checkNotNullExpressionValue(visitFileFailed, "super.visitFileFailed(file, exc)");
        return visitFileFailed;
    }

    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return mo22675a(C14969a.m64318a(obj), iOException);
    }

    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return mo22676b(C14969a.m64318a(obj), basicFileAttributes);
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return mo22677c(C14969a.m64318a(obj), basicFileAttributes);
    }

    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return mo22678d(C14969a.m64318a(obj), iOException);
    }
}
