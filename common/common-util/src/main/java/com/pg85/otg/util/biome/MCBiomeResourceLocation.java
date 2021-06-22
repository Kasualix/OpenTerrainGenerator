package com.pg85.otg.util.biome;

import com.pg85.otg.util.interfaces.IBiomeResourceLocation;

public class MCBiomeResourceLocation implements IBiomeResourceLocation
{	
	private final String domain;
	private final String path;
	private final String presetFolder;
	
	public MCBiomeResourceLocation(String domain, String path, String presetFolderName)
	{
		this.domain = domain;
		this.path = path;
		this.presetFolder = presetFolderName;
	}

	@Override
	public String getPresetFolderName()
	{
		return this.presetFolder;
	}
	
	@Override
	public String toResourceLocationString()
	{
		return String.format("%s%s%s", this.domain, ":", this.path);
	}
}