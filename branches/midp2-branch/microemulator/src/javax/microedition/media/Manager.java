/*
 *  MicroEmulator
 *  Copyright (C) 2002 Bartek Teodorczyk <barteo@barteo.net>
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package javax.microedition.media;

import java.io.InputStream;
import java.io.IOException;

import com.barteo.emulator.media.TonePlayer;


public final class Manager 
{
	public static final String TONE_DEVICE_LOCATOR = "device://tone";
	
	
	public static Player createPlayer(InputStream stream, String type)
			throws IOException, MediaException
	{
		throw new RuntimeException("TODO");
	}
	
	
	public static Player createPlayer(String locator)
			throws IOException, MediaException	
	{
		if (locator == null) {
			throw new IllegalArgumentException();
		}
		if (!locator.equals(TONE_DEVICE_LOCATOR)) {
			throw new MediaException("Cannot create player using " + locator + " locator");
		}
		
		return new TonePlayer();
	}


	public static String[] getSupportedContentTypes(String protocol)
	{
		throw new RuntimeException("TODO");
	}


	public static String[] getSupportedProtocols(String content_type)
	{
		throw new RuntimeException("TODO");
	}


	public static void playTone(int note, int duration, int volume)
			throws MediaException
	{
		throw new RuntimeException("TODO");
	}
	
}
