package com.system.mybatis.generator.plugin;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

public class MapperCommentGenerator implements CommentGenerator {
	// 寮�鐨勫垎闅旂锛屼緥濡俶ysql涓篳锛宻qlserver涓篬
	private String beginningDelimiter = "";
	// 缁撴潫鐨勫垎闅旂锛屼緥濡俶ysql涓篳锛宻qlserver涓篯
	private String endingDelimiter = "";

	public MapperCommentGenerator() {
		super();
	}

	public void addJavaFileComment(CompilationUnit compilationUnit) {
		return;
	}

	/**
	 * xml涓殑娉ㄩ噴
	 *
	 * @param xmlElement
	 */
	public void addComment(XmlElement xmlElement) {
		// xmlElement.addElement(new TextElement("<!--"));
		// StringBuilder sb = new StringBuilder();
		// sb.append(" WARNING - ");
		// sb.append(MergeConstants.NEW_ELEMENT_TAG);
		// xmlElement.addElement(new TextElement(sb.toString()));
		// xmlElement.addElement(new TextElement("-->"));
	}

	public void addRootComment(XmlElement rootElement) {
		return;
	}

	public void addConfigurationProperties(Properties properties) {
		String beginningDelimiter = properties.getProperty("beginningDelimiter");
		if (StringUtility.stringHasValue(beginningDelimiter)) {
			this.beginningDelimiter = beginningDelimiter;
		}
		String endingDelimiter = properties.getProperty("endingDelimiter");
		if (StringUtility.stringHasValue(endingDelimiter)) {
			this.endingDelimiter = endingDelimiter;
		}
	}

	public String getDelimiterName(String name) {
		StringBuilder nameBuilder = new StringBuilder();
		nameBuilder.append(beginningDelimiter);
		nameBuilder.append(name);
		nameBuilder.append(endingDelimiter);
		return nameBuilder.toString();
	}

	/**
	 * 鍒犻櫎鏍囪
	 *
	 * @param javaElement
	 * @param markAsDoNotDelete
	 */
	protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
		StringBuilder sb = new StringBuilder();
		sb.append(" * ");
		sb.append(MergeConstants.NEW_ELEMENT_TAG);
		if (markAsDoNotDelete) {
			sb.append(" do_not_delete_during_merge");
		}
		javaElement.addJavaDocLine(sb.toString());
	}

	/**
	 * Example浣跨敤
	 *
	 * @param innerClass
	 * @param introspectedTable
	 */
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
	}

	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
	}

	/**
	 * 缁欏瓧娈垫坊鍔犳暟鎹簱澶囨敞
	 *
	 * @param field
	 * @param introspectedTable
	 * @param introspectedColumn
	 */
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
			field.addJavaDocLine("/**");
			StringBuilder sb = new StringBuilder();
			sb.append(" * ");
			sb.append(introspectedColumn.getRemarks());
			field.addJavaDocLine(sb.toString());
			field.addJavaDocLine(" */");
		}
	}

	/**
	 * Example浣跨敤
	 *
	 * @param field
	 * @param introspectedTable
	 */
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
	}

	public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

	}

	/**
	 * @param method
	 * @param introspectedTable
	 */
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
	}

	/**
	 * getter鏂规硶娉ㄩ噴
	 *
	 * @param method
	 * @param introspectedTable
	 * @param introspectedColumn
	 */
	public void addGetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		StringBuilder sb = new StringBuilder();
		method.addJavaDocLine("/**");
		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
			sb.append(" * 鑾峰彇");
			sb.append(introspectedColumn.getRemarks());
			method.addJavaDocLine(sb.toString());
			method.addJavaDocLine(" *");
		}
		sb.setLength(0);
		sb.append(" * @return ");
		sb.append(introspectedColumn.getActualColumnName());
		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
			sb.append(" - ");
			sb.append(introspectedColumn.getRemarks());
		}
		method.addJavaDocLine(sb.toString());
		method.addJavaDocLine(" */");
	}

	/**
	 * setter鏂规硶娉ㄩ噴
	 *
	 * @param method
	 * @param introspectedTable
	 * @param introspectedColumn
	 */
	public void addSetterComment(Method method, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		StringBuilder sb = new StringBuilder();
		method.addJavaDocLine("/**");
		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
			sb.append(" * 璁剧疆");
			sb.append(introspectedColumn.getRemarks());
			method.addJavaDocLine(sb.toString());
			method.addJavaDocLine(" *");
		}
		Parameter parm = method.getParameters().get(0);
		sb.setLength(0);
		sb.append(" * @param ");
		sb.append(parm.getName());
		if (StringUtility.stringHasValue(introspectedColumn.getRemarks())) {
			sb.append(" ");
			sb.append(introspectedColumn.getRemarks());
		}
		method.addJavaDocLine(sb.toString());
		method.addJavaDocLine(" */");
	}

	/**
	 * Example浣跨敤
	 *
	 * @param innerClass
	 * @param introspectedTable
	 * @param markAsDoNotDelete
	 */
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
	}
}