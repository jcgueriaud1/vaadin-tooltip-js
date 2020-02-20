import * as $ from 'jquery';
window.jQuery = $;
window.$ = $;


/** You can also change your webpack.config.js
 * Instead
 *
 module.exports = merge(flowDefaults, {
    plugins: [
        new webpack.ProvidePlugin({
            jQuery: 'jquery',
            $: 'jquery'
        }),
    ],

});


 **/