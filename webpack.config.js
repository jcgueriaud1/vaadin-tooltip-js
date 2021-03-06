/**
 * This file has been autogenerated as it didn't exist or was made for an older incompatible version.
 * This file can be used for manual configuration will not be modified if the flowDefaults constant exists.
 */
const merge = require('webpack-merge');
const webpack = require('webpack');
const flowDefaults = require('./webpack.generated.js');


module.exports = merge(flowDefaults, {
     module: {
        rules: [
            {
                test: /\.svg$/,
                use: [
                    {
                        loader: 'raw-loader',
                    },
                ],
            },
            // {
            //     test: /\.scss$/,
            //     use: [{
            //         loader: 'style-loader' // creates style nodes from JS strings
            //     }, {
            //         loader: 'css-loader'   // transates CSS into CommonJS
            //     }, {
            //         loader: 'sass-loader'  // compiles Sass to CSS
            //     }]
            //    // loader: 'style-loader!css-loader!sass-loader'
            // }, {
            //     test: /\.woff(\?v=\d+\.\d+\.\d+)?$/,
            //     loader: "url?limit=10000&mimetype=application/font-woff"
            // }, {
            //     test: /\.woff2(\?v=\d+\.\d+\.\d+)?$/,
            //     loader: "url?limit=10000&mimetype=application/font-woff"
            // }, {
            //     test: /\.ttf(\?v=\d+\.\d+\.\d+)?$/,
            //     loader: "url?limit=10000&mimetype=application/octet-stream"
            // }, {
            //     test: /\.eot(\?v=\d+\.\d+\.\d+)?$/,
            //     loader: "file"
            // }, {
            //     test: /\.svg(\?v=\d+\.\d+\.\d+)?$/,
            //     loader: "url?limit=10000&mimetype=image/svg+xml"
            // }
        ],
    },
    plugins: [
        new webpack.ProvidePlugin({
            jQuery: 'jquery',
            $: 'jquery'
        }),
    ],

});

/**
 * This file can be used to configure the flow plugin defaults.
 * <code>
 *   // Add a custom plugin
 *   flowDefaults.plugins.push(new MyPlugin());
 *
 *   // Update the rules to also transpile `.mjs` files
 *   if (!flowDefaults.module.rules[0].test) {
 *     throw "Unexpected structure in generated webpack config";
 *   }
 *   flowDefaults.module.rules[0].test = /\.m?js$/
 *
 *   // Include a custom JS in the entry point in addition to generated-flow-imports.js
 *   if (typeof flowDefaults.entry.index != "string") {
 *     throw "Unexpected structure in generated webpack config";
 *   }
 *   flowDefaults.entry.index = [flowDefaults.entry.index, "myCustomFile.js"];
 * </code>
 * or add new configuration in the merge block.
 * <code>
 *   module.exports = merge(flowDefaults, {
 *     mode: 'development',
 *     devtool: 'inline-source-map'
 *   });
 * </code>
 */
