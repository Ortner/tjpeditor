/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TagFile#getFile <em>File</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TagFile#getHideResource <em>Hide Resource</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TagFile#getHideTask <em>Hide Task</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TagFile#getRollupResource <em>Rollup Resource</em>}</li>
 *   <li>{@link org.jjflyboy.tjpeditor.project.TagFile#getRollupTask <em>Rollup Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTagFile()
 * @model
 * @generated
 */
public interface TagFile extends EObject
{
  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTagFile_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TagFile#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

  /**
   * Returns the value of the '<em><b>Hide Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide Resource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide Resource</em>' containment reference.
   * @see #setHideResource(HideResource)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTagFile_HideResource()
   * @model containment="true"
   * @generated
   */
  HideResource getHideResource();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TagFile#getHideResource <em>Hide Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide Resource</em>' containment reference.
   * @see #getHideResource()
   * @generated
   */
  void setHideResource(HideResource value);

  /**
   * Returns the value of the '<em><b>Hide Task</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide Task</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide Task</em>' containment reference.
   * @see #setHideTask(HideTask)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTagFile_HideTask()
   * @model containment="true"
   * @generated
   */
  HideTask getHideTask();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TagFile#getHideTask <em>Hide Task</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide Task</em>' containment reference.
   * @see #getHideTask()
   * @generated
   */
  void setHideTask(HideTask value);

  /**
   * Returns the value of the '<em><b>Rollup Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rollup Resource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rollup Resource</em>' containment reference.
   * @see #setRollupResource(RollupResource)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTagFile_RollupResource()
   * @model containment="true"
   * @generated
   */
  RollupResource getRollupResource();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TagFile#getRollupResource <em>Rollup Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rollup Resource</em>' containment reference.
   * @see #getRollupResource()
   * @generated
   */
  void setRollupResource(RollupResource value);

  /**
   * Returns the value of the '<em><b>Rollup Task</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rollup Task</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rollup Task</em>' containment reference.
   * @see #setRollupTask(RollupTask)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getTagFile_RollupTask()
   * @model containment="true"
   * @generated
   */
  RollupTask getRollupTask();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.TagFile#getRollupTask <em>Rollup Task</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rollup Task</em>' containment reference.
   * @see #getRollupTask()
   * @generated
   */
  void setRollupTask(RollupTask value);

} // TagFile
