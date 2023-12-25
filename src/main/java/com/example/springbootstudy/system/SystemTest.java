package com.example.springbootstudy.system;

import java.io.IOException;

public class SystemTest {

    public static void main(String[] args) throws IOException {

        System.out.println("我的" + System.lineSeparator());
        System.out.println("好的");


        /**
         * {PATH=/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/go/bin:/Library/Apple/usr/bin:.:/usr/local/mysql/bin:/Users/willem/go/bin:/usr/local/Cellar/go/1.13/libexec/bin,
         * JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home, COMMAND_MODE=unix2003, VERSIONER_PYTHON_VERSION=2.7, LOGNAME=willem,
         * PWD=/Users/willem/IdeaProjects/SpringBootStudy, XPC_SERVICE_NAME=application.com.jetbrains.intellij.60540565.60541520, __CFBundleIdentifier=com.jetbrains.intellij,
         * SHELL=/bin/zsh, PAGER=less, LSCOLORS=Gxfxcxdxbxegedabagacad, OLDPWD=/, SECURITYSESSIONID=186a9,
         * GOPATH=/Users/willem/go, USER=willem, CLASSPATH=/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/tools.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/lib/dt.jar:.,
         * GOROOT=/usr/local/Cellar/go/1.13/libexec, ZSH=/Users/willem/.oh-my-zsh, LaunchInstanceID=EA0AF9C3-D8D0-4CF7-9D76-577B8A402D3B, TMPDIR=/var/folders/81/b7zgr7w94z34vpf_vfd6mmb00000gn/T/,
         * SSH_AUTH_SOCK=/private/tmp/com.apple.launchd.SucT0XMe3w/Listeners, GOBIN=/Users/willem/go/bin, XPC_FLAGS=0x0, __CF_USER_TEXT_ENCODING=0x1F5:0x19:0x34, LESS=-R, LC_CTYPE=,
         * HOME=/Users/willem, JAVA_MAIN_CLASS_93249=com.example.springbootstudy.system.SystemTest}
         */
        System.out.println(System.getenv());
        /**
         *ava.version
         * Java 运行时环境版本
         * java.vendor
         * Java 运行时环境供应商
         * java.vendor.url
         * Java 供应商的 URL
         * java.home
         * Java 安装目录
         * java.vm.specification.version
         * Java 虚拟机规范版本
         * java.vm.specification.vendor
         * Java 虚拟机规范供应商
         * java.vm.specification.name
         * Java 虚拟机规范名称
         * java.vm.version
         * Java 虚拟机实现版本
         * java.vm.vendor
         * Java 虚拟机实现供应商
         * java.vm.name
         * Java 虚拟机实现名称
         * java.specification.version
         * Java 运行时环境规范版本
         * java.specification.vendor
         * Java 运行时环境规范供应商
         * java.specification.name
         * Java 运行时环境规范名称
         * java.class.version
         * Java 类格式版本号
         * java.class.path
         * Java 类路径
         * java.library.path
         * 加载库时搜索的路径列表
         * java.io.tmpdir
         * 默认的临时文件路径
         * java.compiler
         * 要使用的 JIT 编译器的名称
         * java.ext.dirs
         * 一个或多个扩展目录的路径
         * os.name
         * 操作系统的名称
         * os.arch
         * 操作系统的架构
         * os.version
         * 操作系统的版本
         * file.separator
         * 文件分隔符（在 UNIX 系统中是“/”）
         * path.separator
         * 路径分隔符（在 UNIX 系统中是“:”）
         * line.separator
         * 行分隔符（在 UNIX 系统中是“/n”）
         * user.name
         * 用户的账户名称
         * user.home
         * 用户的主目录
         * user.dir
         * 用户的当前工作目录
         *
         */
        System.out.println(System.getProperty("user.dir"));


        System.out.println(System.getSecurityManager());


        System.out.println(System.inheritedChannel());


        System.out.println(System.nanoTime());


    }


}
