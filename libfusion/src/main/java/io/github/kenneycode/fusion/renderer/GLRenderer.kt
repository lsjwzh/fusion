package io.github.kenneycode.fusion.renderer

import android.graphics.Bitmap

/**
 *
 * Coded by kenney
 *
 * http://www.github.com/kenneycode/fusion
 *
 * GL渲染器接口
 *
 */

interface GLRenderer : Renderer {

    /**
     *
     * 初始化参数
     *
     */
    fun initParameter()

    /**
     *
     * 设置attribute float数组
     *
     * @param key attribute参数名
     * @param value float数组
     * @param componentCount 每个顶点的成份数（一维，二维..）
     *
     */
    fun setAttributeFloats(key: String, value: FloatArray, componentCount: Int = 2)

    /**
     *
     * 设置顶点坐标，默认是二维坐标
     *
     * @param positions 顶点坐标数组
     *
     */
    fun setPositions(positions: FloatArray, componentCount: Int = 2)

    /**
     *
     * 设置纹理坐标
     *
     * @param textureCoordinates 纹理坐标数组
     *
     */
    fun setTextureCoordinates(textureCoordinates: FloatArray)

    /**
     *
     * 设置 bitmap 纹理参数
     *
     * @param key 纹理参数名
     * @param value bitmap
     *
     */
    fun setUniformBitmapTexture2D(key: String, value: Bitmap, index: Int = 0)

    /**
     *
     * 设置纹理参数
     *
     * @param key 纹理参数名
     * @param value 纹理id
     *
     */
    fun setUniformTexture2D(key: String, value: Int, index: Int = 0)

    /**
     *
     * 设置OES纹理参数
     *
     * @param key 纹理参数名
     * @param value 纹理id
     *
     */
    fun setUniformOESTexture(key: String, value: Int)

    /**
     *
     * 设置4*4 Matrix参数
     *
     * @param key 纹理参数名
     * @param value 4*4 Matrix
     *
     */
    fun setUniformMat4(key: String, value: FloatArray)

    /**
     *
     * 设置float参数
     *
     * @param key float参数名
     * @param value float参数
     *
     */
    fun setUniformFloat(key: String, value: Float)

    /**
     *
     * 设置float数组参数
     *
     * @param key float数组参数名
     * @param value float数组参数
     *
     */
    fun setUniformFloatArray(key: String, value: FloatArray)

    /**
     *
     * 设置int参数
     *
     * @param key int参数名
     * @param value int参数
     *
     */
    fun setUniformInt(key: String, value: Int)

    /**
     *
     * 设置MVP
     *
     * @param value 4*4 MVP Matrix
     *
     */
    fun setMVPMatrix(value: FloatArray)

    /**
     *
     * @param flipX 水平翻转
     * @param flipY 垂直翻转
     *
     */
    fun setFlip(flipX: Boolean, flipY: Boolean)

    /**
     *
     * 绑定输入
     *
     */
    fun bindInput()

    /**
     *
     * 绑定输出
     *
     */
    fun bindOutput()

    /**
     *
     * 绑定参数
     *
     */
    fun bindParameters()

    /**
     *
     * 解绑输入
     *
     */
    fun unBindInput()

}
