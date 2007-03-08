package org.python.pydev.refactoring.core;

public class FQIdentifier {

	private String module;

	private String realName;

	private String alias;

	public FQIdentifier(String module, String realName, String alias) {
		this.module = module;
		this.realName = realName;
		this.alias = alias;
	}

	public String getAlias() {
		return alias;
	}

	public String getModule() {
		return module;
	}

	public String getRealName() {
		return realName;
	}

	public String getFQName() {
		return module + "." + realName;
	}

	public String getProbableModuleName() {
		int offset = getRealName().indexOf(".");
		if (offset > 1) {
			return getModule() + "." + getRealName().substring(0, offset);
		}
		return getModule();
	}

}