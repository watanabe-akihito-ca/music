/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package api.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import net.arnx.jsonic.JSON;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.util.ResponseUtil;

import util.Constants;
import api.entity.Music;
import api.service.ArtistService;
import api.service.MusicService;

public class ApiAcion {

	//TODO かり
	private final String ARTIST_ID = "artist_id";
	private final String ID = "id";
	private final String TITLE = "title";
	private final String OUTLINE = "outline";

	/** サービス */
	@Resource
	ArtistService artistService;

	@Resource
	MusicService musicService;

	@IntegerType
	public Integer artist_id;

	@IntegerType
	public Integer id;



	/**
	 * No.1 GET /api/musics
	 * @return
	 */
    @Execute(validator = false)
	public String musics() {

    	Map<String, Object> responseData = new HashMap<String, Object>();


        String jsonText = JSON.encode(responseData);
        ResponseUtil.write(jsonText, Constants.APPLICATION_JSON);

        return null;
	}

	/**
	 * No.2 GET /api/musics/:id
	 * @return
	 */
	@Execute(urlPattern="musics/{id}")
	public String music() {
    	Music music = musicService.findById(id);
		String jsonText = JSON.encode(music);
        ResponseUtil.write(jsonText, Constants.APPLICATION_JSON);
		return null;
	}






}
