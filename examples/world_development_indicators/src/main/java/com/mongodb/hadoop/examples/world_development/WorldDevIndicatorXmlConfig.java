/*
 * Copyright 2011 10gen Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mongodb.hadoop.examples.world_development;

// Mongo

import com.mongodb.hadoop.util.MongoTool;

// Hadoop
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ToolRunner;

/**
 * The world development xml config class.
 */
public class WorldDevIndicatorXmlConfig extends MongoTool {

    static{
        // Load the XML config defined in hadoop-local.xml
        Configuration.addDefaultResource( "src/examples/hadoop-local.xml" );
        Configuration.addDefaultResource( "src/examples/mongo-defaults.xml" );
    }

    public static void main( final String[] pArgs ) throws Exception{
        System.exit( ToolRunner.run( new WorldDevIndicatorXmlConfig(), pArgs ) );
    }
}

